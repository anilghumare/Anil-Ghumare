package com.zensar.springbootdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootdemo.entity.Student;

@RestController
@RequestMapping("/student-api")
public class StudentController {
	
	// http://localhost:8080/student-api/students   -> GET

	private List<Student> students = new ArrayList<Student>();

	public StudentController() {
		students.add(new Student(1001, "Ram", 30));
		students.add(new Student(1002, "Seeta", 28));
		students.add(new Student(1003, "Laxman", 26));
	}

	// http://localhost:8080/students/1001 GET
	//@RequestMapping(value = "/students/{studentId}",method=RequestMethod.GET)
	@GetMapping(value="/students/{studentId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Student getStudent(@PathVariable("studentId") int studentId) {
		//System.out.println("studentId" +studentId);
		for(Student student:students) {
			if(student.getStudentId()==studentId) {
				return student;
			}
			
		}
		return null;
	}

	// http://localhost:8080/students
	//@RequestMapping(value = { "/students", "/listOfStudents" },method=RequestMethod.GET)
	@GetMapping(value = { "/students", "/listOfStudents" },produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Student> getAllStudents() {
		return students;
	}
	
	// http://localhost:8080/students POST
	//@RequestMapping(value = "/students",method=RequestMethod.POST)
	@PostMapping(value="/students",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
	public void insertStudent(@RequestBody Student student) {
		
		students.add(student);
		//System.out.println("HI");
	}
	
	//@RequestMapping(value="/students/{studentId}",method=RequestMethod.PUT)
	@PutMapping(value="/students/{studentId}",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void updateStudent(@PathVariable("studentId")int studentId,@RequestBody Student student) {
		Student student2 = getStudent(studentId);
		student2.setStudentId(student.getStudentId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentAge(student.getStudentAge());
		
		students.add(student2);
		
	}
	
	//http://localhost:8080/students/1001 -> Delete
	//@RequestMapping(value="/students/{studentId}",method=RequestMethod.DELETE)
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable("studentId")int studentId) {
		for(int i=0;i<students.size();i++) {
			Student student=students.get(i);
			if(student.getStudentId()==studentId) {
				 students.remove(student);
			}
			
		}
	}

}
