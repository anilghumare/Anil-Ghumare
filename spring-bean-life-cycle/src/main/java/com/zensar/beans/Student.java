package com.zensar.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements BeanNameAware,InitializingBean,DisposableBean {

	
	private int studentId;
	
	private String studentName;
	
	private int studentAge;

	public Student() {
		super();
		System.out.println("I am inside default constructor");
	}

	

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;

	}

	public int getStudentId() {
		System.out.println();
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("I am inside setStudentId");
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

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}



	public void setBeanName(String name) {
		System.out.println("Name of the bean is "+name);
		
	}



	public void destroy() throws Exception {
		System.out.println("Inside public void destroy() throws Exception");
		
	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside public void afterPropertiesSet() throws Exception");
		
	}

}
