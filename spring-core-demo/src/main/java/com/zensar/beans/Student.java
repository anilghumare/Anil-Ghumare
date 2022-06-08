package com.zensar.beans;

import java.util.Map;
import java.util.Properties;

public class Student {

	private int studentId;
	private String studentName;
	private int studentAge;

	private Map<Address,Integer> address;
	
	private Properties properties;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge, Map<Address,Integer> address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Map<Address,Integer> getAddress() {
		return address;
	}

	public void setAddress(Map<Address,Integer> address) {
		this.address = address;
	}
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + ", properties=" + properties + "]";
	}

	
	
	


}
