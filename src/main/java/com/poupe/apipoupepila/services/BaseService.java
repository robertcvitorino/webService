package com.poupe.apipoupepila.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poupe.apipoupepila.domain.Base;
import com.poupe.apipoupepila.repositories.BaseRepository;

@Service
public class BaseService {

	@Autowired 
	private BaseRepository baseRepository;
	
	
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
	
	
}
