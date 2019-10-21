package com.poupe.apipoupepila.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poupe.apipoupepila.domain.Cliente;
import com.poupe.apipoupepila.services.ClienteService;

@RestController
@RequestMapping(value = "/api")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(path =  "cliente/{id}")
	public ResponseEntity<?> buscarClienteId(@PathVariable Integer id) {		
		Cliente clineteObj = clienteService.buscarId(id);		
		return ResponseEntity.ok().body(clineteObj);
	}
	
	
	
	
}
