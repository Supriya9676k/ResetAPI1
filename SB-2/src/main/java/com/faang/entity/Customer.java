package com.faang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@Column
	private Integer cno;
	@Column
	private String cname;
	@Column
	private String cloc;
	@Column
	private Integer phn;
	
	
	
	public Customer(Integer cno, String cname, String cloc, Integer phn) {
		this.cno = cno;
		this.cname = cname;
		this.cloc = cloc;
		this.phn = phn;
	}

	public Integer getPhn() {
		return phn;
	}

	public void setPhn(Integer phn) {
		this.phn = phn;
	}

	public Customer() {
	}


	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCloc() {
		return cloc;
	}

	public void setCloc(String cloc) {
		this.cloc = cloc;
	}
 
	

	
	
}
