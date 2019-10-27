package com.poupe.apipoupepila.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poupe.apipoupepila.domain.Base;
import com.poupe.apipoupepila.domain.Estabelecimento;
import com.poupe.apipoupepila.dto.BaseDTO;
import com.poupe.apipoupepila.repositories.BaseRepository;
import com.poupe.apipoupepila.repositories.EstabelecimentoRepository;

@Service
public class BaseService {

	@Autowired 
	private BaseRepository baseRepository;
	
	
	@Autowired 
	private EstabelecimentoRepository estabelecimentoRepository;
	
	
	@Transactional
	public Base inserirBase(Base baseObj) {
		baseObj.setId(null);
		return baseRepository.save(baseObj);
	}
	

	public Base buscarId(Integer id) {
		Optional<Base> produto = baseRepository.findById(id);
		return produto.orElse(null);
		
	}
	
	
	public Base buscarEan(String ean) {
		Base produto = baseRepository.findByEan(ean);
		return produto;
		
	}
	
	
	public List<Base> findAll(){
		return baseRepository.findAll();
	}
	
	public Base fromDTO(BaseDTO baseDTO) {		
		
		Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(baseDTO.getEstabID());
		
	
		//Cadastro de 1 registro 
		Base baseObj = new Base (null,
				baseDTO.getEan(),
				baseDTO.getNome(), 
				baseDTO.getPrecoOficial(),
				estabelecimento.orElse(null)
				);
		
		estabelecimento.orElse(null).setBase(baseObj);
						
		
		return baseObj;
	}
	
	
}
