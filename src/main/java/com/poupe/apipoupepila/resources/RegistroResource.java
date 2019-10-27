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

import com.poupe.apipoupepila.domain.Registro;
import com.poupe.apipoupepila.dto.RegistroDTO;
import com.poupe.apipoupepila.services.RegistroService;

@RestController
@RequestMapping(value ="/api")
public class RegistroResource {
	
	
	@Autowired 
	private RegistroService registroService; 
		

	
	@GetMapping(path ="/registro/{id}")
	public ResponseEntity<?> buscarIdRegistro(@PathVariable Integer id) {	
		Registro registroObj = registroService.buscarId(id);			
		return ResponseEntity.ok().body(registroObj);
	}
	
	
	
	@PostMapping(path ="/registro")
	public ResponseEntity<Void> CadastraProduto(@RequestBody RegistroDTO registroObj){
		
		Registro registro= registroService.fromDTO(registroObj);
		
		registro= registroService.inserirRegistro(registro);
		
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(registro.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		
	}
	

}
