package com.poupe.apipoupepila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.Lista;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Integer> {

}
