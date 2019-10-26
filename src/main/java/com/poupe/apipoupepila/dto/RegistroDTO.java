package com.poupe.apipoupepila.dto;

import java.io.Serializable;
import java.util.Date;



public class RegistroDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Date dataInsercao;		
	
	private String novoEstabelecimento;		
	
	private Double precoDigitado;
	
	private Boolean precoVerificado;
	
	private Integer clienteID;
	private Integer estabelecimentoID;	
	private Integer produtoID;
	
	
	public RegistroDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Boolean getPrecoVerificado() {
		return precoVerificado;
	}



	public void setPrecoVerificado(Boolean precoVerificado) {
		this.precoVerificado = precoVerificado;
	}



	public Date getDataInsercao() {
		return dataInsercao;
	}
	public void setDataInsercao(Date dataInsercao) {
		this.dataInsercao = dataInsercao;
	}
	public String getNovoEstabelecimento() {
		return novoEstabelecimento;
	}
	public void setNovoEstabelecimento(String novoEstabelecimento) {
		this.novoEstabelecimento = novoEstabelecimento;
	}
	public Double getPrecoDigitado() {
		return precoDigitado;
	}
	public void setPrecoDigitado(Double precoDigitado) {
		this.precoDigitado = precoDigitado;
	}
	public Integer getClienteID() {
		return clienteID;
	}
	public void setClienteID(Integer clienteID) {
		this.clienteID = clienteID;
	}
	public Integer getEstabelecimentoID() {
		return estabelecimentoID;
	}
	public void setEstabelecimentoID(Integer estabelecimentoID) {
		this.estabelecimentoID = estabelecimentoID;
	}	
	public Integer getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(Integer produtoID) {
		this.produtoID = produtoID;
	}
	
	
	
	
		
	
	
	
	
	
	
	
	
	
}
