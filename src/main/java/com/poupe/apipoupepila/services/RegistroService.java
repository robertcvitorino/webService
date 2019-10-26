package com.poupe.apipoupepila.services;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poupe.apipoupepila.domain.Cliente;
import com.poupe.apipoupepila.domain.Estabelecimento;
import com.poupe.apipoupepila.domain.Produto;
import com.poupe.apipoupepila.domain.Registro;
import com.poupe.apipoupepila.dto.RegistroDTO;
import com.poupe.apipoupepila.repositories.ClienteRepository;
import com.poupe.apipoupepila.repositories.EstabelecimentoRepository;
import com.poupe.apipoupepila.repositories.ProdutoRepository;
import com.poupe.apipoupepila.repositories.RegistroRepository;



@Service
public class RegistroService {

	@Autowired
	private RegistroRepository registroRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private ClienteRepository clienteRepositoryRepository;
	
	
	
	
	
	//Função que cadastra cliente
			@Transactional
			public Registro inserirRegistro(Registro registroObj) {
				
				
				registroObj.setId(null);
				return registroRepository.save(registroObj);
			}
			
			
			
			public Registro buscarId(Integer id) {
				Optional<Registro> registro = registroRepository.findById(id);
				
				return registro.orElse(null);				
			}
			
			
			public Registro fromDTO(RegistroDTO registroDto) {
		
				Optional<Produto> produto = produtoRepository.findById(registroDto.getProdutoID());
				Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(registroDto.getEstabelecimentoID());
				Optional<Cliente> cliente = clienteRepositoryRepository.findById(registroDto.getClienteID());
						
				Registro registroObj = new Registro(null,
						registroDto.getDataInsercao(), 
						registroDto.getNovoEstabelecimento(),
						registroDto.getPrecoDigitado(),
						registroDto.getPrecoVerificado(),
						produto.orElse(null), 
						estabelecimento.orElse(null),
						cliente.orElse(null)
						);
				
				produto.orElse(null).getRegistro().add(registroObj);
				cliente.orElse(null).getRegistros().add(registroObj);
				estabelecimento.orElse(null).getRegistros().add(registroObj);
				
				
				return registroObj;
				
				
			}
			
		
	
	
	
}
