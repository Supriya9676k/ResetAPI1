package com.faang.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faang.model.Carona;
import com.faang.repository.CaronaRepository;

@Service
public class CaronaService {
	@Autowired
	CaronaRepository repo;
	
	
public Carona addingCaronaPatient(Carona carona) {
	Carona patientResponse=repo.save(carona);
	return patientResponse;
}
public Carona updatingCaronaPatient(Carona carona) {
	Carona patientResponse=repo.save(carona);
	return patientResponse;
}
public void deletingCaronaPatient(Carona carona) {
	repo.deleteById(carona.getId());
}
public void deletingAllCaronaPatient() {
	repo.deleteAll();
}
public Optional<Carona> findingByIdCaronaPatient(Integer id) {
	Optional<Carona> patientResponse=repo.findById(id);
	return patientResponse;
}
public Iterable<Carona> findingAllCaronaPatient() {
	Iterable<Carona> resp=repo.findAll();
	return resp;
}
}
