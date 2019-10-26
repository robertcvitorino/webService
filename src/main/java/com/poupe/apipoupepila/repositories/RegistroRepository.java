package com.poupe.apipoupepila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {

	


}
