package com.zensar.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Employee;

@RestController
public class EmployeeController {
	private List<Employee> employees = new ArrayList<Employee>();

	public EmployeeController() {
		employees.add(new Employee(100, "Anil", 22));
		employees.add(new Employee(101, "Amol", 24));
		employees.add(new Employee(102, "Ajay", 25));

	}

	//@RequestMapping("/employees/{employeeId}")
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;

	}

	//@RequestMapping("/employees")
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employees;
	}
	@PostMapping("/employees")
	public void insertEmployee(@RequestBody Employee employee) {
		employees.add(employee);
	}
	
	public void updateEmployee() {
		Employee employee2 = getEmployee(employeeId);
		employee2.setEmployeeId(employee2.getEmployeeId());
		employee2.setEmployeeName(employee.get);
	}

}
