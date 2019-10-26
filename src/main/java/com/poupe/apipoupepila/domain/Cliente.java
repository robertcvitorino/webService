package com.poupe.apipoupepila.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
@Table(name="CLIENTE")
public class Cliente implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;		
	// tamanho 50 , nome do campo no SGBD, Não pode ser nulo 
	@Column(length=50,name="CLIENTE_NOME")
	private String nome;	
	
	@Column(length=12,name="CLIENTE_SENHA")
	private String senha;
	
	@Column(length=11,name="CLIENTE_TELEFONE")
	private String telefone;	
	
	@Column(length=50,name="CLIENTE_BAIRRO")
	private String bairro;
	
	@Column(length=50,name="CLIENTE_CIDADE")
	private String cidade;
	
	@Column(length=2,name="CLIENTE_UF")
	private String uf;
	
	
	@Column(name="CLIENTE_PREMIUM")
	private Boolean premium;
	
	
	/*
	//Relacionamento Tabela Registro
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "registro_id")
	private Registro registro;
	*/
	// Relacionamento Tabela lista do cliente 
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente" , cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Lista> listas= new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Registro> registros = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="estabelecimento_id")
	Estabelecimento estabelecimento;
	

	
	// Getter e Setter da Classe 
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	

	

	public Cliente(Integer id, String nome, String senha, String telefone, String bairro, String cidade, String uf,
			Boolean premium, List<Lista> listas, List<Registro> registros, Estabelecimento estabelecimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.telefone = telefone;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.premium = premium;
		this.listas = listas;
		this.registros = registros;
		this.estabelecimento = estabelecimento;
	}





	public List<Lista> getListas() {
		return listas;
	}



	public void setListas(List<Lista> listas) {
		this.listas = listas;
	}



	public List<Registro> getRegistros() {
		return registros;
	}



	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}



	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}



	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
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