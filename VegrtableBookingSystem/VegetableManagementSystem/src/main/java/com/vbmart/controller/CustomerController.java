package com.vbmart.controller;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vbmart.dto.CustomerDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Customer;
import com.vbmart.repository.CustomerRepository;
import com.vbmart.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	CustomerRepository customerRepository;

	@PostMapping("/save")
	public ResponseEntity<CustomerDTO> saveCustomerDetails(@RequestBody CustomerDTO customerDTO)
			throws BadRequestException {

		try {
			customerDTO = customerService.saveCustomerDetails(customerDTO);
		} catch (BadRequestException e) {
			throw new BadRequestException("Failed to save customer details");

		}
		return new ResponseEntity<>(customerDTO, HttpStatus.CREATED);

	}

	@GetMapping("cus/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomerId(@PathVariable long customerId) throws BadRequestException {
		CustomerDTO customerDTO = null;
		try {
			customerDTO = customerService.getSaveCustomer(customerId);
			if (customerDTO != null) {
				return new ResponseEntity<>(customerDTO, HttpStatus.OK);
			} else {
				throw new BadRequestException("");
			}
		} catch (BadRequestException e) {
			throw new BadRequestException("customer id is not matched please enter correct " + customerId);

		}
	}

	@GetMapping("get/{customerName}")
	public ResponseEntity<CustomerDTO>getCustomerNmae(@PathVariable String customerName) throws BadRequestException{
		CustomerDTO customerDTO=null;
		try {
			customerDTO=customerService.getCustomerName(customerName);
			if(customerDTO !=null) {
				return new ResponseEntity<>(customerDTO,HttpStatus.OK);
			}
			else {
				throw new BadRequestException("");
			}
		}
			catch (BadRequestException e) {
				throw new BadRequestException("customer name is not matched please enter correct " + customerName);

			}
		
		
		
	}
	
	
	@GetMapping("/search")
 	//@PreAuthorize("hasRole('ADMIN')")

	public ResponseEntity<List<Customer>> searchCustomer(@RequestParam(value = "query") String query)
			throws BadRequestException {

		List<Customer> customerDTOs = customerService.searchCustomer(query);
		return new ResponseEntity<List<Customer>>(customerDTOs, HttpStatus.OK);

	}

	
	
	@GetMapping("/customerpagination")
	public ResponseEntity<List<Customer>> getPaginationCustomer(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize) {
		List<Customer> customer = customerService.getPaginationCustomer(pageNo, pageSize);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);

	}

	@GetMapping("/list")
	public ResponseEntity<List<CustomerDTO>> getAll() {
		List<CustomerDTO> list = customerService.getAll();
		return new ResponseEntity<List<CustomerDTO>>(list, HttpStatus.OK);

	}

	@PutMapping("/modifylist/{customerId}")
	public ResponseEntity<CustomerDTO> update(@PathVariable long customerId, @RequestBody CustomerDTO customerDTO)
			throws BadRequestException {
		if (!customerRepository.existsById(customerId)) {
			throw new BadRequestException("Failed to update the customer Id" + customerId);

		}

		customerDTO = customerService.updateCustomer(customerDTO);
		return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK);

	}
	



	
	@SuppressWarnings("static-access")
	@DeleteMapping("/delete-customer")
	public ResponseEntity<String> deleteCustomer(@RequestParam Long customerId,@RequestBody CustomerDTO customerDTO) throws BadRequestException{
		if(!customerRepository.existsById(customerId)) {
			throw new BadRequestException("Failed to delete customer id"+customerId);
		}

		customerDTO = customerService.deleteCustomer(customerId);
		return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK).ok("customer deleted successfully");
		
	
		
		
	}
	
//	try {
//		service.deleteVegetable(id);
//		return ResponseEntity.ok("Vegetable deleted successfully");
//	} catch (ResourceNotFoundException e) {
//		return ResponseEntity.unprocessableEntity().body(e.getMessage());
//	}
}
