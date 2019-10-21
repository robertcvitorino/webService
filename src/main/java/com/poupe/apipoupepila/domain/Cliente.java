package com.poupe.apipoupepila.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;		
	// tamanho 50 , nome do campo no SGBD, Não pode ser nulo 
	@Column(length=50,name="CLIENTE_NOME",nullable=true)
	private String nome;	
	
	@Column(length=12,name="CLIENTE_SENHA",nullable=true)
	private String senha;
	
	@Column(length=11,name="CLIENTE_TELEFONE")
	private String telefone;	
	
	@Column(length=50,name="CLIENTE_BAIRRO",nullable=true)
	private String bairro;
	
	@Column(length=50,name="CLIENTE_CIDADE",nullable=true)
	private String cidade;
	
	@Column(length=2,name="CLIENTE_UF",nullable=true)
	private String uf;
	
	
	@Column(name="CLIENTE_PREMIUM",nullable=true)
	private Boolean premium;
	
	
	//Relacionamento Tabela Registro 
	@OneToMany(mappedBy="cliente")
	private List<Registro> registros;
	
	// Relacionamento Tabela lista do cliente 
	@OneToMany
	private List<Lista> listas;


	
	// Getter e Setter da Classe 

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


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
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


	public Boolean getPremium() {
		return premium;
	}


	public void setPremium(Boolean premium) {
		this.premium = premium;
	}
		
	

}