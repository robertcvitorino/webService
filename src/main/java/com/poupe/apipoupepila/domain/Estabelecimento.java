package com.poupe.apipoupepila.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="ESTABELECIMENTO")
public class Estabelecimento {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	// tamanho 50 , nome do campo no SGBD, Não pode ser nulo 
	@Column(length=50,name="ESTABELECIMENTO_NOME",nullable=true)
	private String nome;	
	
	@Column(length=11,name="ESTABELECIMENTO_TELEFONE")
	private String telefone;
	
	@Column(length=50,name="ESTABELECIMENTO_BAIRRO",nullable=true)
	private String bairro;
	
	@Column(length=50,name="ESTABELECIMENTO_CIDADE",nullable=true)
	private String cidade;
	
	@Column(length=2,name="ESTABELECIMENTO_UF",nullable=true)
	private String uf;
	
	
	//Relacionamento Tabela Registro 
	@JsonBackReference
	@OneToMany
	private List<Registro> registros;
	
	public Estabelecimento() {
		// TODO Auto-generated constructor stub
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}