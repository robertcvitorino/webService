package com.poupe.apipoupepila.domain;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	
	@NaturalId
	@Column(length=13,name="PRODUTO_EAN",nullable=true)
	private String ean;
	
	@Column(length=50,name="PRODUTO_DEPARTAMENTO")
	private String departamento;
	
	
	/*
	@ManyToOne
	@JoinColumn(name = "registro_id")
	private Registro registro;
	*/
	@JsonBackReference
	@OneToMany(mappedBy = "produto")		
	private List<Registro> registro= new ArrayList<>();
	
	
	
	
	
	//Getter e Setter da Classe 
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(Integer id, String nome, String ean, String departamento, List<Registro> registro) {
		super();
		this.id = id;
		this.nome = nome;
		this.ean = ean;
		this.departamento = departamento;
		this.registro = registro;
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


	public List<Registro> getRegistro() {
		return registro;
	}


	public void setRegistro(List<Registro> registro) {
		this.registro = registro;
	}


		
}