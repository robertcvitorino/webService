package com.poupe.apipoupepila.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poupe.apipoupepila.domain.Cliente;

import com.poupe.apipoupepila.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	//Função que cadastra cliente
		public Cliente inserirCliente(Cliente clienteObj) {
			clienteObj.setId(null);
			return clienteRepository.save(clienteObj);
		}
	
	
	//Função busca cliente por ID
	public Cliente buscarId(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElse(null);
		
	}
	//Função que busca supermercado por Nome
	public Cliente buscarPorNome(String nome) {
		Cliente clienteObj = clienteRepository.findByNome(nome);
		return clienteObj;
			
	}
	
	
	
}
