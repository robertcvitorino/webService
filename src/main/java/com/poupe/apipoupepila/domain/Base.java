package com.poupe.apipoupepila.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="BASE")
public class Base {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	

	@JsonBackReference
	@OneToMany
	private List<Registro> registros;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}