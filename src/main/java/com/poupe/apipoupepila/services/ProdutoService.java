package com.poupe.apipoupepila.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poupe.apipoupepila.domain.Produto;
import com.poupe.apipoupepila.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired ProdutoRepository produtoRepository;
	
	
	@Transactional
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
	
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	
}
