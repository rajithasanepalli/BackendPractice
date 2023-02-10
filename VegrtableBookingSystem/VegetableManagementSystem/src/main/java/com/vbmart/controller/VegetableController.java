package com.vbmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vbmart.dto.VegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Vegetable;
import com.vbmart.repository.VegetableRepository;
import com.vbmart.service.VegetableService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class VegetableController {

	
	@Autowired
	private VegetableService vegetableService;
	
	@Autowired
	private VegetableRepository vegetableRepository;

   // @PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/vegcreate")
	public ResponseEntity<VegetableDTO> saveVegaetble(@RequestBody VegetableDTO vegetableDTO) {
		return new ResponseEntity<>(vegetableService.saveVegetable(vegetableDTO), HttpStatus.CREATED);

	}

   // @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/veg/{vegetableId}")
	public ResponseEntity<VegetableDTO> getVegetableId(@PathVariable long vegetableId) throws BadRequestException {
		VegetableDTO vegetableDTO = null;

		try {

			vegetableDTO = vegetableService.findByVegetableId(vegetableId);
			if (vegetableDTO != null) {
				return new ResponseEntity<>(vegetableDTO, HttpStatus.OK);

			} else {
				throw new BadRequestException("");

			}

		} catch (BadRequestException e) {
			throw new BadRequestException("vegetable id is not matched please enter correct Id"+ + vegetableId);
		}

	}

   // @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/listofveg")
	public ResponseEntity<List<VegetableDTO>> getAll(){
		List<VegetableDTO> list=vegetableService.getAll();
		return new ResponseEntity<List<VegetableDTO>>(list,HttpStatus.OK);
	}
	
	
   // @PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/modifyveg/{vegetableId}")
	
	public ResponseEntity<VegetableDTO> update(@PathVariable long vegetableId, @RequestBody VegetableDTO vegetableDTO)
	throws BadRequestException{
		if(!vegetableRepository.existsById(vegetableId)) {
			throw new BadRequestException("Failed to update vegetable id" +vegetableId);
		}
		vegetableDTO=vegetableService.updateVegetable(vegetableDTO);
		return new ResponseEntity<VegetableDTO>(vegetableDTO,HttpStatus.OK);
		
	}
	
	
//	@GetMapping("/customerList")
//	public ResponseEntity<List<Customer>> getPaginationCustomer(@RequestParam(defaultValue = "0") Integer pageNo,
//			@RequestParam(defaultValue = "10") Integer pageSize) {
//		List<Customer> customer = customerService.getPaginationCustomer(pageNo, pageSize);
//		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
//
//	}
//	
   // @PreAuthorize("hasRole('USER')")
	@GetMapping("/vegpagination")
	public ResponseEntity<List<Vegetable>>getPaginationVegetable(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize){
		List<Vegetable> vegetable=vegetableService.getPaginationVegetable(pageNo, pageSize);
		return new ResponseEntity<List<Vegetable>>(vegetable,HttpStatus.OK);
		
		
	}
}
