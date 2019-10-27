package com.poupe.apipoupepila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.Base;
@Repository
public interface BaseRepository extends JpaRepository<Base, Integer> {

	Base findByEan(String ean);
	
	/*
	@Query("SELECT DISTINCT obj FROM Registro obj INNER JOIN obj.base bas WHERE obj.precoOficial=:precoOficial ");
	Base retornaPrecoOficialBase(Double precoBase);
		SELECT DISTINCT obj FORM Registro obj 
		INNER JOIN Base objbase ON  obj.base_id = objbase_id
		WHERE objbase.precoOficial	
		
			
			
			SELECT obj FROM Registro obj WHERE obj.base.id=1
			
			
			
			SELECT obj FROM Registro obj WHERE obj.id=obj.base.id
			
			
Query query = em.createQuery("SELECT p FROM Teacher t JOIN t.phones p WHERE t.firstName = :firstName");
 
query.setParameter("firstName", "Pranil");
List<Phone> phones = (List<Phone>) query.getResultList();
		
			/*
			 * Select na Tabela Registro 
			 * onde id da Tabela Base tem que ser igual ao id da Tabela Base
			 * retorne o valor precoOficial que está na Tabela Base 
			 * 
			 *
	
	@Query("SELECT DISTINCT obj FORM Registro obj INNER JOIN obj.base base ON  obj.base_id = base.id WHERE base.precoOficial")		
	Base findByprecoOficalRegistro();
	
		@Query(" SELECT obj FROM Registro obj WHERE obj.base.nome = nome")
	Base findByprecoOficalRegistro(@Param("nome")String nome);
	
	 */

}
