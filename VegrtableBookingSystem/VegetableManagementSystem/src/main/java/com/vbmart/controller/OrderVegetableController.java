package com.vbmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vbmart.dto.OrderVegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.OrderVegetable;
import com.vbmart.repository.OrderVegetableRepository;
import com.vbmart.service.OrderVegetableService;

@RestController
public class OrderVegetableController {
	
	@Autowired 
	private OrderVegetableRepository orderVegetableRepository;
	
	@Autowired
	 private OrderVegetableService orderVegetableService;
	
	@PostMapping("/Ordervegcreate")
	public ResponseEntity<OrderVegetableDTO>saveOrderVegetable(@RequestBody OrderVegetableDTO orderVegetableDTO)
	throws BadRequestException{
		return new ResponseEntity<>(orderVegetableService.saveOrderVegetable(orderVegetableDTO),HttpStatus.OK);
		
	}

	@GetMapping("/orderveg/{id}")
	
	public ResponseEntity<OrderVegetableDTO>getOrderVegetable(@PathVariable long orderVegetableId)
	throws BadRequestException{
		OrderVegetableDTO orderVegetableDTO=null;
		try {
			orderVegetableDTO=orderVegetableService.getOrderVegetableById(orderVegetableId);
			if(orderVegetableDTO!=null) {
				return new ResponseEntity<>(orderVegetableDTO,HttpStatus.OK);
			}
			else {
				throw new BadRequestException("");
			}
		}
			catch (BadRequestException e) {
			throw new BadRequestException("Order Vegetable id not matched .Please enter correct id"+orderVegetableId);
			}
		}
	
	@PutMapping("/modifyorderveg/{id}")
	public ResponseEntity<OrderVegetableDTO>updateOrderVeg(@PathVariable long id,@RequestBody OrderVegetableDTO orderVegetableDTO)
	throws BadRequestException{
		if(!orderVegetableRepository.existsById(id)) {
		throw new BadRequestException("Failed to update ordervegetable id" +id);
		}
		orderVegetableDTO=orderVegetableService.updateOrderVegetable(orderVegetableDTO);
		return new ResponseEntity<OrderVegetableDTO>(orderVegetableDTO,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/listoforderveg")
	public ResponseEntity<List<OrderVegetableDTO>>getAll(){
		List<OrderVegetableDTO> list=orderVegetableService.getall();
		return new ResponseEntity<List<OrderVegetableDTO>>(list,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/ordervegpagination")
	public ResponseEntity<List<OrderVegetable>>getordervegpagination(@RequestParam (defaultValue = "0") Integer pageNo,
			@RequestParam (defaultValue = "10") Integer pageSize){
		List<OrderVegetable>orderVegetable=orderVegetableService.getPaginationOrderVegetable(pageNo, pageSize);
		return new ResponseEntity<List<OrderVegetable>>(orderVegetable,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
