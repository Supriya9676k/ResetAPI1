package com.faang.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faang.entity.Customer;
import com.faang.repository.CustomRepository;

@Service
public class CustomerService {

	@Autowired
	CustomRepository repo;
	
	public Customer insertingRecord(Customer cust) {
		Customer customerRes=repo.save(cust);
		return customerRes;
	}
	public Customer updatingRecord(Customer cust) {
		Customer customerRes=repo.save(cust);
		return customerRes;
	}
	public Customer deletingSingleRecord(Customer cust) {
		repo.deleteById(cust.getCno());
		return cust;
	}
	public void deletingAllRecord() {
		repo.deleteAll();
	}
	
	public Optional<Customer> retrievingSingleRecord(Integer cno) {
		Optional<Customer> customerRes=repo.findById(cno);
		return customerRes;
	}
	
	public Iterable<Customer> retrievingAllRecord() {
		Iterable<Customer> customerRes=repo.findAll();
		return customerRes;
	}
	
}
