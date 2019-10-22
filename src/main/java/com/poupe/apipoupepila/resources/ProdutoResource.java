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


import com.poupe.apipoupepila.domain.Produto;
import com.poupe.apipoupepila.services.ProdutoService;

@RestController
@RequestMapping(value ="/api")
public class ProdutoResource {
	
	
	@Autowired 
	private ProdutoService produtoService;
	
	
	@GetMapping(path =  "/produto/{id}")
	public ResponseEntity<?> buscarIdProduto(@PathVariable Integer id) {	
		Produto produtoObj = produtoService.buscarId(id);
			
		return ResponseEntity.ok().body(produtoObj);
	}
	
	@GetMapping(path = "/produtoE/{ean}")
	public ResponseEntity<?> buscarEanProduto(@PathVariable String ean){
		Produto produtoObj= produtoService.buscarEan(ean);
		return ResponseEntity.ok().body(produtoObj);
	}
	
	
	@PostMapping(path = "/produto")
	public ResponseEntity<Void> CadastraProduto(@RequestBody Produto produto){
		produto=produtoService.inserirProduto(produto);
		
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(produto.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		
	}
	

}
