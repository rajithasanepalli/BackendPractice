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

import com.vbmart.dto.OrderDTO;

import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Order;

import com.vbmart.repository.OrderRepository;
import com.vbmart.service.OrderService;

@RestController
public class OrderController {
	@Autowired 
	private OrderRepository orderRepository;
	
	@Autowired
	
	private OrderService orderService;
	
	@PostMapping("/ordercreate")
	public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO) throws BadRequestException {
		return new ResponseEntity<>(orderService.saveOrderDetails(orderDTO),HttpStatus.CREATED);
		
	}


	@GetMapping("/order/{orderId}")
	public ResponseEntity<OrderDTO> getOrderId(@PathVariable long orderId) throws BadRequestException {
		OrderDTO orderDTO=null;
		try {
			orderDTO=orderService.getOrder(orderId);
			if(orderDTO!=null) {
				return new ResponseEntity<>(orderDTO,HttpStatus.OK);
			}
			else {
				throw new BadRequestException("");
			}
		}
		catch(BadRequestException e) {
			throw new BadRequestException("Order id not matched.please enter correct Id"+orderId);
			
		}
		
	}
	
	
	
	@PutMapping("/modifyorder/{orderId}")
	 public ResponseEntity<OrderDTO> updateOrder(@PathVariable long orderId,@RequestBody OrderDTO orderDTO) throws BadRequestException {
		if(!orderRepository.existsById(orderId)) {
			throw new BadRequestException("Failed to update order id" +orderId);
		}
		orderDTO=orderService.updateOrder(orderDTO);
		return new ResponseEntity<OrderDTO>(orderDTO,HttpStatus.OK);
		
	}


	@GetMapping("/listofOrders")
	public ResponseEntity<List<OrderDTO>>getAll(){
		List<OrderDTO> list=orderService.getAll();
		return new ResponseEntity<List<OrderDTO>>(list,HttpStatus.OK);
	}
	

	@GetMapping("/orderPagination")
	public ResponseEntity<List<Order>>getPaginationOrder(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10")Integer pageSize){
		List<Order> order=orderService.getPaginationOrder(pageNo, pageSize);
				return new ResponseEntity<List<Order>>(order,HttpStatus.OK);
		
	}
	
}
