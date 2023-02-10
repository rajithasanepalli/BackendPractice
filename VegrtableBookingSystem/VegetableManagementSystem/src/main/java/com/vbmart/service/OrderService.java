package com.vbmart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vbmart.dto.OrderDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Order;

@Service
public interface OrderService {
	OrderDTO saveOrderDetails(OrderDTO orderDTO) throws BadRequestException;
	OrderDTO getOrder(long orderId) throws BadRequestException;

	OrderDTO updateOrder(OrderDTO orderDTO) throws BadRequestException;
	List<OrderDTO>getAll();
	List<Order> getPaginationOrder(int pageNo,int pageSize);
	
	
}
