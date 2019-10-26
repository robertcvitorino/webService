package com.poupe.apipoupepila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.Base;
@Repository
public interface BaseRepository extends JpaRepository<Base, Integer> {

	Base findByEan(String ean);
	
	/*
	@Query("SELECT DISTINCT obj FROM Registro obj INNER JOIN obj.base bas WHERE obj.precoOficial LIKE %:prr% AND cat IN :categorias");
	Base retornaPrecoOficialBase(Double precoBase);
		
			/*
			 * Select na Tabela Registro 
			 * onde id da Tabela Base tem que ser igual ao id da Tabela Base
			 * retorne o valor precoOficial que está na Tabela Base 
			 * 
			 * */
	
	
	
	
	

}
