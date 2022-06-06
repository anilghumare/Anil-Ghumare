package com.zensar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "StudentInformation")
@Table(name = "StudentInfo")


@NamedQueries(value = {
		@NamedQuery(name = "abc", query = "FROM StudentInformation s where s.studentName=:name"),
		@NamedQuery(name="pqr",query="FROM StudentInformation s")
})




public class Student {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name="name",length = 50)
	private String studentName;
	
	@Column(name = "age",nullable = false )
	private int studentAge;
	
	@Temporal(value = TemporalType.DATE)
	private Date birthDate;
	
	private Department department;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	

	public Student(int studentId, String studentName, int studentAge, Date birthDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.birthDate = birthDate;
	}
	
	
	

	public Student(String studentName, int studentAge, Date birthDate) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.birthDate = birthDate;
	}
	
	

	public Student(int studentId, String studentName, int studentAge, Date birthDate, Department department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.birthDate = birthDate;
		this.department = department;
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
	
	

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", birthDate=" + birthDate + ", department=" + department + "]";
	}

	
	
	

}
