package com.poupe.apipoupepila.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

	Cliente  findByNome(String nome);
}
