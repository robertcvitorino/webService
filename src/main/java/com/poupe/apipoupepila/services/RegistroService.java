package com.poupe.apipoupepila.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poupe.apipoupepila.domain.Base;
import com.poupe.apipoupepila.domain.Cliente;
import com.poupe.apipoupepila.domain.Estabelecimento;
import com.poupe.apipoupepila.domain.Produto;
import com.poupe.apipoupepila.domain.Registro;
import com.poupe.apipoupepila.repositories.BaseRepository;
import com.poupe.apipoupepila.repositories.ClienteRepository;
import com.poupe.apipoupepila.repositories.EstabelecimentoRepository;
import com.poupe.apipoupepila.repositories.ProdutoRepository;

@Service
public class RegistroService {

	@Autowired
	 private ClienteRepository clienteRepository;
	@Autowired
	 private BaseRepository baseRepository;
	@Autowired 
	 private EstabelecimentoRepository estabelecimentoRepository;
	@Autowired 
	private ProdutoRepository produtoRepository;
	
	
	public void salvarRegistro(Cliente cliente,Estabelecimento estabelecimento,Produto produto, Base base) {
		
		//ID de Cliente 
		Integer idCliente =cliente.getId();		
		Optional<Cliente> clienteObj=clienteRepository.findById(idCliente);
		
		//Id de Estabelecimento
		Integer idEstab= estabelecimento.getId();				
		Optional<Estabelecimento> estabelecimentoObj =estabelecimentoRepository.findById(idEstab);
		
		//ID de Produto
		Integer idProduto = produto.getId();		
		Optional<Produto> produtoObj = produtoRepository.findById(idProduto);
		
		//ID de base
		Integer idBase = base.getId();
		Optional<Base> baseObjBase = baseRepository.findById(idBase);
		
		
		Registro registro = null;
		registro.setBase(base);
		registro.setCliente(cliente);;
		registro.setEstabelecimento(estabelecimento);
		registro.setProduto(produto);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
