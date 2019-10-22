package com.poupe.apipoupepila.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poupe.apipoupepila.domain.Estabelecimento;

import com.poupe.apipoupepila.repositories.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {

	@Autowired 
	private EstabelecimentoRepository estabelecimentoRepository;
	
	//Função que cadastra supermercado 
	public Estabelecimento inserirEstab(Estabelecimento estabelecimentoObj) {
		estabelecimentoObj.setId(null);
		return estabelecimentoRepository.save(estabelecimentoObj);
	}
	
	//Função que busca supermercado por ID
	public Estabelecimento buscarIdEstab(Integer id) {
		Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);	
		
		return estabelecimento.orElse(null);
		
	}
	
	//Função que busca supermercado por Nome
	public Estabelecimento buscarPorNome(String nome) {
		Estabelecimento estabelecimentoObj = estabelecimentoRepository.findByNome(nome);
		return estabelecimentoObj;
		
	}
	
	
	
}
