package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String bh;
	
	@Column(nullable = true)
	private String test;

	public String getTest() {
		return test;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	

}
