package com.poupe.apipoupepila.dto;

import java.io.Serializable;

import com.poupe.apipoupepila.domain.Estabelecimento;

public class EstabelecimentoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;	
	
	private String nome;		
	private String telefone;	
	private String bairro;	
	private String cidade;	
	private String uf;	
	private Integer registroID;
	
	public EstabelecimentoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public EstabelecimentoDTO(Estabelecimento estabelecimento) {
		
		id=estabelecimento.getId();
		nome=estabelecimento.getNome();
		telefone=estabelecimento.getTelefone();
		bairro=estabelecimento.getBairro();
		cidade=estabelecimento.getCidade();
		uf = estabelecimento.getUf();
	
		
	}
	
	
	public Integer getRegistroID() {
		return registroID;
	}
	public void setRegistroID(Integer registroID) {
		this.registroID = registroID;
	}
	/*
	public Integer getClienteID() {
		return clienteID;
	}
	public void setClienteID(Integer clienteID) {
		this.clienteID = clienteID;
	}*/
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
