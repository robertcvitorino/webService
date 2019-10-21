package com.poupe.apipoupepila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity 
@Table(name="REGISTRO_PENDENTE")
public class RegistroPendente {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	
	@Column(name="REGISTRO_PENDENTE_VALIDADO" ,nullable=true)
	private Boolean validado;
	
	//Relacionamento com tabela registro.
	
	@OneToOne
	@JoinColumn(name="registro_Id")
	private Registro registro;	
	
	

	
	//Getter e Setter da Classe

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getValidado() {
		return validado;
	}

	public void setValidado(Boolean validado) {
		this.validado = validado;
	}
	
	
	
}