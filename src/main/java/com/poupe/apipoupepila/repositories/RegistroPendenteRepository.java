package com.poupe.apipoupepila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.RegistroPendente;

@Repository
public interface RegistroPendenteRepository extends JpaRepository<RegistroPendente, Integer> {

}
