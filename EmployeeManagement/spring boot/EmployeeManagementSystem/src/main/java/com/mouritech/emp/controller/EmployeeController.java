package com.mouritech.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.emp.model.Employee;
import com.mouritech.emp.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees rest apis
	
	@GetMapping("/employees")
	 public List<Employee> getAllEmployees(){
		 return employeeRepository.findAll();
	 }
	
	@PostMapping("/saveEmployees")
	public Employee saveEmployees(@RequestBody Employee employee){
		return employeeRepository.save(employee);
		
		
	}
	

}
