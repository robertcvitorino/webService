package com.poupe.apipoupepila.dto;

import java.io.Serializable;

import com.poupe.apipoupepila.domain.Base;

public class BaseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;	
	private String ean;
	private String nome;
	private Double precoOficial;
	private Integer estabID;
	
	//private Integer registoID;
	
	
	public BaseDTO() {
		// TODO Auto-generated constructor stub
	}

	public BaseDTO(Base baseObj) {
		id=baseObj.getId();
		ean =baseObj.getEan();
		nome=baseObj.getNome();
		precoOficial=baseObj.getPrecoOficial();
	
	}
	
	
	
	

	public Integer getEstabID() {
		return estabID;
	}

	public void setEstabID(Integer estabID) {
		this.estabID = estabID;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEan() {
		return ean;
	}


	public void setEan(String ean) {
		this.ean = ean;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPrecoOficial() {
		return precoOficial;
	}


	public void setPrecoOficial(Double precoOficial) {
		this.precoOficial = precoOficial;
	}

	/*
	public Integer getRegistoID() {
		return registoID;
	}


	public void setRegistoID(Integer registoID) {
		this.registoID = registoID;
	}
	*/
	
	
	
	
}
