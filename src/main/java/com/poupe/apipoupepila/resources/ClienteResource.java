package com.poupe.apipoupepila.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.poupe.apipoupepila.domain.Cliente;
import com.poupe.apipoupepila.services.ClienteService;

@RestController
@RequestMapping(value = "/api")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	//Pesquisa de cliente por ID
	@GetMapping(path =  "cliente/{id}")
	public ResponseEntity<?> buscarClienteId(@PathVariable Integer id) {		
		Cliente clineteObj = clienteService.buscarId(id);		
		return ResponseEntity.ok().body(clineteObj);		
	}
	
	
	//Pesquisa de cliente por Nome
		@GetMapping(path = "/clienteN/{nome}")
		public ResponseEntity<?> buscarClienteNome(@PathVariable String nome){
			Cliente clienteObj= clienteService.buscarPorNome(nome);
			
			return ResponseEntity.ok().body(clienteObj);
		}	
		//Cadastro de Cliente
		@PostMapping(path = "/cliente")
		public ResponseEntity<Void> CadastraCliente(@RequestBody Cliente cliente){	
			cliente = clienteService.inserirCliente(cliente);
			
			URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}").buildAndExpand(cliente.getId()).toUri();
			return ResponseEntity.created(uri).build();
			
			
		}
		
	
	
	
}
