package com.mouritech.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mouritech.emp.exception.ResourceNotFoundException;
import com.mouritech.emp.model.Employee;

@Service
public interface EmployeeService {
	
	 Employee saveEmployee(Employee employee) throws ResourceNotFoundException;

	List<Employee> getAll();

}
