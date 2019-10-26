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

import com.poupe.apipoupepila.domain.Estabelecimento;
import com.poupe.apipoupepila.dto.EstabelecimentoDTO;
import com.poupe.apipoupepila.services.EstabelecimentoService;

@RestController
@RequestMapping(value ="/api")
public class EstabelecimentoResource {
	
	
	@Autowired 
	private EstabelecimentoService estabelecimentoService;
	
	//Pesquisa de supermercado por ID
	@GetMapping(path =  "/estabelecimento/{id}")
	public ResponseEntity<?> buscarIdEstab(@PathVariable Integer id) {
		Estabelecimento estabelecimentoObj= estabelecimentoService.buscarIdEstab(id);			
		return ResponseEntity.ok().body(estabelecimentoObj);
	}
	//Pesquisa de todos od  supermercado
	@GetMapping(path = "/estabelecimentos")	
	public ResponseEntity<List<EstabelecimentoDTO>> findAll() {
		List<Estabelecimento> list = estabelecimentoService.findAll();
		List<EstabelecimentoDTO> listDto = list.stream().map(obj -> new EstabelecimentoDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}
	
	
	
	//Pesquisa de supermercado por Nome
	@GetMapping(path = "/estabelecimentoN/{nome}")
	public ResponseEntity<?> buscarEstabNome(@PathVariable String nome){
		Estabelecimento estabelecimentoObj= estabelecimentoService.buscarPorNome(nome);
		
		return ResponseEntity.ok().body(estabelecimentoObj);
	}	
	//Cadastro de Supermercado
	@PostMapping(path = "/estabelecimento")
	public ResponseEntity<Void> CadastraEstabelecimeto(@RequestBody Estabelecimento estabelecimento){	
		estabelecimento = estabelecimentoService.inserirEstab(estabelecimento);
		
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(estabelecimento.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
		
	}
	

}
