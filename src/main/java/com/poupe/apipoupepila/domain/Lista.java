package com.poupe.apipoupepila.domain;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name="LISTA")
public class Lista implements Serializable {

	private static final long serialVersionUID = 1L;
			
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	  

    //Relacionamento Tabela Cliente
	
    @ManyToOne
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;
    
    
    
   
    
    //Getter e Setter da Classe 
    
    public Lista() {
		// TODO Auto-generated constructor stub
	}
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	
}