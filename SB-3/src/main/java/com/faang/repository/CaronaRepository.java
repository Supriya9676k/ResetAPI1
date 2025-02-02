package com.faang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faang.model.Carona;

@Repository
public interface CaronaRepository extends CrudRepository<Carona,Integer> {

}
