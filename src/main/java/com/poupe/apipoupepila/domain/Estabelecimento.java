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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="ESTABELECIMENTO")
public class Estabelecimento implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	// tamanho 50 , nome do campo no SGBD, Não pode ser nulo 
	@Column(length=50,name="ESTABELECIMENTO_NOME")
	private String nome;	
	
	@Column(length=11,name="ESTABELECIMENTO_TELEFONE")
	private String telefone;
	
	@Column(length=50,name="ESTABELECIMENTO_BAIRRO")
	private String bairro;
	
	@Column(length=50,name="ESTABELECIMENTO_CIDADE")
	private String cidade;
	
	@Column(length=2,name="ESTABELECIMENTO_UF")
	private String uf;
	
	
	//Relacionamento Tabela Registro 

	@JsonIgnore
	@OneToMany(mappedBy = "estabelecimento",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Registro> registros= new ArrayList<>();
	/*
	@JsonIgnore
	@OneToMany(mappedBy = "estabelecimento",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Cliente> clientes= new ArrayList<>();
	*/
	public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	public Estabelecimento(Integer id, String nome, String telefone, String bairro, String cidade, String uf,
			List<Registro> registros) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.registros = registros;
		
	}



	public List<Registro> getRegistros() {
		return registros;
	}





	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}


/*


	public List<Cliente> getClientes() {
		return clientes;
	}





	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
*/




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