package com.poupe.apipoupepila.dto;

import java.io.Serializable;

import com.poupe.apipoupepila.domain.Cliente;



public class ClienteDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;			
	private String nome;			
	private String senha;	
	private String telefone;		
	private String bairro;	
	private String cidade;	
	private String uf;	
	private Boolean premium;
	
	
	//Contrutor da Classe
	
	public ClienteDTO() {
		
	}
	//Construtor de CLiente
	public ClienteDTO(Cliente clienteObjt) {
		
		id=clienteObjt.getId();
		nome=clienteObjt.getNome();
		senha=clienteObjt.getSenha();
		telefone=clienteObjt.getTelefone();
		bairro=clienteObjt.getBairro();
		cidade=clienteObjt.getCidade();
		uf = clienteObjt.getUf();
		premium=clienteObjt.getPremium();
		
		
	}
	
	//Getter e Setter da classe

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
