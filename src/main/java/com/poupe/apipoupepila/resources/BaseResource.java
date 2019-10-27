package com.poupe.apipoupepila.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.poupe.apipoupepila.domain.Base;
import com.poupe.apipoupepila.dto.BaseDTO;
import com.poupe.apipoupepila.services.BaseService;

@RestController
@RequestMapping(value ="/api")
public class BaseResource {
	
	
	@Autowired 
	private BaseService baseService;
	
	
	//Pesquisa todos os  produtos
		@GetMapping(path = "/base-produtos")	
		public ResponseEntity<List<BaseDTO>> findAll() {
			List<Base> list = baseService.findAll();
			List<BaseDTO> listDto = list.stream().map(obj -> new BaseDTO(obj)).collect(Collectors.toList());  
			return ResponseEntity.ok().body(listDto);
		}
	
	@GetMapping(path =  "/base-produto/{id}")
	public ResponseEntity<?> buscarIdBase(@PathVariable Integer id) {	
		Base baseObj = baseService.buscarId(id);
			
		return ResponseEntity.ok().body(baseObj);
	}
	
	@GetMapping(path = "/base-produtoE/{ean}")
	public ResponseEntity<?> buscarEanBase(@PathVariable String ean){
		Base produtoObj= baseService.buscarEan(ean);
		return ResponseEntity.ok().body(produtoObj);
	}
	
	
	@PostMapping(path = "/base-produto")
	public ResponseEntity<Void> CadastraBase(@RequestBody Base baseObj){
		baseObj=baseService.inserirBase(baseObj);
		
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(baseObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PostMapping(path = "/baseReg")
	public ResponseEntity<Void> CadastraProduto(@RequestBody BaseDTO baseObj){
		
		Base base= baseService.fromDTO(baseObj);
		
		base= baseService.inserirBase(base);
		
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(base.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		
	}
	
	

}
