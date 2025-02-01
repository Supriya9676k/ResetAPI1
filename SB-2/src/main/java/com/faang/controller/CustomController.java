package com.faang.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.faang.entity.Customer;
import com.faang.service.CustomerService;

@RestController
public class CustomController {
	@Autowired
	CustomerService service;
	
	@PostMapping(value="/insertRecord",consumes="application/json",produces="application/json")
	public Customer insertRecord(@RequestBody Customer cus) {
		Customer custresponse=service.insertingRecord(cus);
		return custresponse;
	}
	
	@PutMapping(value="/updateRecord",consumes="application/json",produces="application/json")
	public Customer updateRecord(@RequestBody Customer cus) {
		Customer custresponse=service.updatingRecord(cus);
		return custresponse;
	}
	@DeleteMapping(value="/deleteRecord",consumes="application/json",produces="application/json")
	public Customer deleteRecord(@RequestBody Customer cus) {
		Customer custresponse=service.deletingSingleRecord(cus);
		return custresponse;
	}
	@DeleteMapping(value="/deletingAllRecord",consumes="application/json",produces="application/json")
	public void deletingAllRecord() {
		service.deletingAllRecord();
		
	}
	
	@GetMapping(value="/retrievingRecord")
	public Optional<Customer> retrievingRecord(@RequestParam("cno") Integer cno) {
		Optional<Customer> custresponse=service.retrievingSingleRecord(cno);
		return custresponse;
		
	}
	
	@GetMapping(value="/retrievingAllRecord",produces="application/json")
	public Iterable<Customer>  retrievingAllRecord() {
		Iterable<Customer> custresponse=service.retrievingAllRecord();
		return custresponse;
		
	}

}
