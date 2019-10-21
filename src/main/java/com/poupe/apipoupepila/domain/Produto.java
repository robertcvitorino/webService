package com.poupe.apipoupepila.domain;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto {	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	// tamanho 50 , nome do campo no SGBD, Não pode ser nulo 
	@Column(length=100,name="PRODUTO_NOME",nullable=true)
	private String nome;	
	
	@Column(length=13,name="PRODUTO_EAN",nullable=true)
	private Character ean;
	
	@Column(length=50,name="PRODUTO_DEPARTAMENTO")
	private String departamento;
	
	
	
	@OneToMany
	private List<Registro> registros;
	
	
	
	
	
	//Getter e Setter da Classe 
	
	

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

	public Character getEan() {
		return ean;
	}

	public void setEan(Character ean) {
		this.ean = ean;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}