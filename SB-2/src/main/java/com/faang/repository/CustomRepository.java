package com.faang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faang.entity.Customer;

@Repository
public interface CustomRepository extends CrudRepository<Customer,Integer>{

}
