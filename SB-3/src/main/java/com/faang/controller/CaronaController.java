package com.faang.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.faang.model.Carona;
import com.faang.service.CaronaService;

@RestController
public class CaronaController {
	@Autowired
	CaronaService service;
	
	@PostMapping(value="/addCaronaPatient")
	public Carona addCaronaPatient(@RequestBody Carona carona) {
		Carona patientResponse=service.addingCaronaPatient(carona);
		return patientResponse;
	}
	
	@PutMapping(value="/updateCaronaPatient")
	public Carona updateCaronaPatient(@RequestBody Carona carona) {
		Carona patientResponse=service.updatingCaronaPatient(carona);
		return patientResponse;
	}
	@DeleteMapping(value="/deleteCaronaPatient")
	public void deleteCaronaPatient(@RequestBody Carona carona) {
		service.deletingCaronaPatient(carona);
		
	}
	@DeleteMapping(value="/deleteAllCaronaPatient")
	public void deleteAllCaronaPatient(@RequestBody Carona carona) {
		 service.deletingAllCaronaPatient();
	}
	@GetMapping(value="/findCaronaPatient")
	public Optional<Carona> findCaronaPatient(@RequestParam("id") Integer id) {
		Optional<Carona> patientResponse=service.findingByIdCaronaPatient(id);
		return patientResponse;
		
	}
	@GetMapping(value="/findAllCaronaPatient")
	public Iterable<Carona> findAllCaronaPatient() {
		Iterable<Carona> patientResponse=service.findingAllCaronaPatient();
		return patientResponse;

	}
	
}
