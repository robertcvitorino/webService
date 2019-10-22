package com.poupe.apipoupepila.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.poupe.apipoupepila.domain.Produto;
import com.poupe.apipoupepila.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired ProdutoRepository produtoRepository;
	
	
	
	public Produto inserirProduto(Produto produtoObj) {
		produtoObj.setId(null);
		return produtoRepository.save(produtoObj);
	}
	

	public Produto buscarId(Integer id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.orElse(null);
		
	}
	
	
	public Produto buscarEan(String ean) {
		Produto produto = produtoRepository.findByEan(ean);
		return produto;
		
	}
	
	
}
