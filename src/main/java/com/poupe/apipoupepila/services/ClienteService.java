package com.poupe.apipoupepila.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poupe.apipoupepila.domain.Cliente;

import com.poupe.apipoupepila.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	//Função que cadastra cliente
	@Transactional
		public Cliente inserirCliente(Cliente clienteObj) {
			clienteObj.setId(null);
			return clienteRepository.save(clienteObj);
		}
	
	
	//Função busca cliente por ID
	public Cliente buscarId(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElse(null);
		
	}
	//Função que busca cliente por Nome
	public Cliente buscarPorNome(String nome) {
		Cliente clienteObj = clienteRepository.findByNome(nome);
		return clienteObj;
			
	}
	//Função que busca todos clientes e retorna para o ClienteResource
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	
}
