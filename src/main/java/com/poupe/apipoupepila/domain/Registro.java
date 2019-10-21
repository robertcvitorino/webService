package com.poupe.apipoupepila.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="REGISTRO")
public class Registro {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REGISTRO_DATA_HORA",nullable=true)
	private Date dataInsercao;
	
	
	
	@Column(name="REGISTRO_NOVO_ESTABELECIMENTO",nullable=true)
	private String novoEstabelecimento;
	
	
	
	@Column(name="REGISTRO_PRECO_DIGITADO",nullable=true,precision=2)
	private BigDecimal precoDigitado;
	
	
	@Column(name="REGISTRO_PRECO_VERFIFICADO",nullable=true)
	private Boolean precoVerificado;

	
	//Relaciomanto Tabela cliente 
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public RegistroPendente getRegistroPendente() {
		return registroPendente;
	}


	public void setRegistroPendente(RegistroPendente registroPendente) {
		this.registroPendente = registroPendente;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}


	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}


	public Base getBase() {
		return base;
	}


	public void setBase(Base base) {
		this.base = base;
	}


	// Relacionamento Tabela Registo pendente 
	@OneToOne(mappedBy="registro")
	private RegistroPendente registroPendente;
	
	//Tronar ean Primary Key 
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;
	
	//Relacionamento Tabela Estabelecimento 
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	private Estabelecimento estabelecimento;
	
	//Relacionamento Tabela Base 
	@ManyToOne
	@JoinColumn(name="base_id")
	private Base base;
	
	
	
	
	//Getter e Setter da Classe
	
	public Registro() {
		// TODO Auto-generated constructor stub
	}
	

	public Registro(Integer id, Date dataInsercao, String novoEstabelecimento, BigDecimal precoDigitado,
			Boolean precoVerificado) {
		super();
		this.id = id;
		this.dataInsercao = dataInsercao;
		this.novoEstabelecimento = novoEstabelecimento;
		this.precoDigitado = precoDigitado;
		this.precoVerificado = precoVerificado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public BigDecimal getPrecoDigitado() {
		return precoDigitado;
	}


	public void setPrecoDigitado(BigDecimal precoDigitado) {
		this.precoDigitado = precoDigitado;
	}


	public Boolean getPrecoVerificado() {
		return precoVerificado;
	}


	public void setPrecoVerificado(Boolean precoVerificado) {
		this.precoVerificado = precoVerificado;
	}
	
	
}