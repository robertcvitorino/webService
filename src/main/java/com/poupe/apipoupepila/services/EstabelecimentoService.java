package com.poupe.apipoupepila.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poupe.apipoupepila.domain.Estabelecimento;
import com.poupe.apipoupepila.domain.Registro;
import com.poupe.apipoupepila.dto.EstabelecimentoDTO;
import com.poupe.apipoupepila.repositories.EstabelecimentoRepository;
import com.poupe.apipoupepila.repositories.RegistroRepository;

@Service
public class EstabelecimentoService {

	@Autowired 
	private EstabelecimentoRepository estabelecimentoRepository;
	/*
	@Autowired
	private ClienteRepository clienteRepository;
	*/
	@Autowired
	private RegistroRepository registroRepository;
	
	
	
	
	
	
	//Função que cadastra supermercado 
	@Transactional
	public Estabelecimento inserirEstab(Estabelecimento estabelecimentoObj) {
		estabelecimentoObj.setId(null);
		return estabelecimentoRepository.save(estabelecimentoObj);
	}
	
	//Função que busca supermercado por ID
	public Estabelecimento buscarIdEstab(Integer id) {
		Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);	
		return estabelecimento.orElse(null);
	}
	//Função que busca todos supermercado 
	public List<Estabelecimento> findAll() {		
		return estabelecimentoRepository.findAll();
	}
	
	
	//Função que busca supermercado por Nome
	public Estabelecimento buscarPorNome(String nome) {
		Estabelecimento estabelecimentoObj = estabelecimentoRepository.findByNome(nome);
		return estabelecimentoObj;
	}
	
	public Estabelecimento fromDTO(EstabelecimentoDTO estabelecimentoDto) {
	//	Optional<Cliente> cliente = clienteRepository.findById(estabelecimentoObj.getClienteID());
		Optional<Registro>  registro = registroRepository.findById(estabelecimentoDto.getRegistroID());
			
 		
		Estabelecimento estabelecimento = new Estabelecimento(null,
				estabelecimentoDto.getNome(), 
				estabelecimentoDto.getTelefone(), 
				estabelecimentoDto.getBairro(), 
				estabelecimentoDto.getCidade(),
				estabelecimentoDto.getUf(),	
				Arrays.asList(registro.orElse(null))					
						);
				
		Arrays.asList(registro.orElse(null).getEstabelecimento()).add(estabelecimento);
		
		return estabelecimento;
	}
	
	
	
}
