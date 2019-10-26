package com.poupe.apipoupepila.dto;

import java.io.Serializable;

import com.poupe.apipoupepila.domain.Produto;



public class ProdutoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;		
	private String nome;		
	private String ean;
	private String departamento;
	
	
	public ProdutoDTO() {
		// TODO Auto-generated constructor stub
	}


	public ProdutoDTO(Produto produto) {
		id = produto.getId();
		nome=produto.getNome();
		ean=produto.getEan();
		departamento=produto.getDepartamento();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEan() {
		return ean;
	}


	public void setEan(String ean) {
		this.ean = ean;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	

}
