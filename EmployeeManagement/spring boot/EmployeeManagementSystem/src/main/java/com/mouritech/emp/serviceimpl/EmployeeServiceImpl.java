package com.mouritech.emp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.emp.exception.ResourceNotFoundException;
import com.mouritech.emp.model.Employee;
import com.mouritech.emp.repository.EmployeeRepository;
import com.mouritech.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) throws ResourceNotFoundException {
		employee = employeeRepository.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<>();
		return employees;
		
		
	}

}
