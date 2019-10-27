package com.poupe.apipoupepila.domain;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="BASE")
public class Base implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	private String ean;
	private String nome;
	private Double precoOficial;
	
	@OneToOne
	@JoinColumn(name="estabeleciment_Id")
	private Estabelecimento estabelecimento;
	
	public Base() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	@OneToOne
	private Registro registros;
	*/
	
	public Base(Integer id, String ean, String nome, Double precoOficial, Estabelecimento estabelecimento) {
		super();
		this.id = id;
		this.ean = ean;
		this.nome = nome;
		this.precoOficial = precoOficial;
		this.estabelecimento = estabelecimento;
	}

	

	public Integer getId() {
		return id;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
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
	public Registro getRegistros() {
		return registros;
	}

	public void setRegistros(Registro registros) {
		this.registros = registros;
	}
	*/

	

}