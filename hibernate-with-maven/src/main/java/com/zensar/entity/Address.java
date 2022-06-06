package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	private int houseNo;
	
	private String state;
	
	private String city;
	
	private int pinCode;
	
	@ManyToOne
	private Student student;
	
	

	public Address() {
		super();
	}

	

	public Address(int houseNo, String state, String city, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}



	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



	public int getHouseNo() {
		return houseNo;
	}



	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	
	
	

}
