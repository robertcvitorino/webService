package com.poupe.apipoupepila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poupe.apipoupepila.domain.Base;
@Repository
public interface BaseRepository extends JpaRepository<Base, Integer> {

}
