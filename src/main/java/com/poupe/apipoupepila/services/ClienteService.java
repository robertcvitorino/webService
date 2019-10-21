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
	
	
	public Cliente buscarId(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElse(null);
		
	}
	
	
	
}
