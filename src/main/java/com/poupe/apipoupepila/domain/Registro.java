package com.poupe.apipoupepila.domain;

import java.io.Serializable;
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



@Entity
@Table(name="REGISTRO")
public class Registro implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REGISTRO_DATA_HORA")
	private Date dataInsercao;	
	
	@Column(name="REGISTRO_NOVO_ESTABELECIMENTO")
	private String novoEstabelecimento;	
	
	@Column(name="REGISTRO_PRECO_DIGITADO")
	private Double precoDigitado;
	
	@Column(name="REGISTRO_PRECO_VERFIFICADO")
	private Boolean precoVerificado;
	
	

	// Relacionamento Tabela Registo pendente 
	@OneToOne(mappedBy="registros")
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
	
	@OneToOne
	@JoinColumn(name="base_id")
	private Base base;
	

	//Relaciomanto Tabela cliente 
		
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;		
	
	
	
	//Getter e Setter da Classe
	
	public Registro() {
		// TODO Auto-generated constructor stub
	}
	


	public Registro(Integer id, Date dataInsercao, String novoEstabelecimento, Double precoDigitado,
			Boolean precoVerificado, Produto produto,Estabelecimento estabelecimento, 
			 Cliente cliente) {
		super();
		this.id = id;
		this.dataInsercao = dataInsercao;
		this.novoEstabelecimento = novoEstabelecimento;
		this.precoDigitado = precoDigitado;
		this.precoVerificado = precoVerificado;		
		this.produto = produto;
		this.estabelecimento = estabelecimento;		
		this.cliente = cliente;
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


	public Double getPrecoDigitado() {
		return precoDigitado;
	}


	public void setPrecoDigitado(Double precoDigitado) {
		this.precoDigitado = precoDigitado;
	}


	public Boolean getPrecoVerificado() {
		return precoVerificado;
	}


	public void setPrecoVerificado(Boolean precoVerificado) {
		this.precoVerificado = precoVerificado;
	}




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
	
}