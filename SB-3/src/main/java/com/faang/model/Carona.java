package com.faang.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Carona {
	@Id
	@Column
	Integer id;
	@Column
	String name;
	@Column
	String gender;
	@Column
	String status;
	
	public Carona() {
	
	}
	

	public Carona(Integer id, String name, String gender, String status) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.status = status;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
