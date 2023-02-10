package com.vbmart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vbmart.dto.OrderVegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.OrderVegetable;

@Service
public interface OrderVegetableService {
	OrderVegetableDTO saveOrderVegetable(OrderVegetableDTO orderVegetableDTO) throws BadRequestException;
	OrderVegetableDTO updateOrderVegetable(OrderVegetableDTO orderVegetableDTO)throws BadRequestException;
	OrderVegetableDTO getOrderVegetableById(long orderVegetableId) throws BadRequestException
;
	List<OrderVegetableDTO>getall();
	List<OrderVegetable>getPaginationOrderVegetable(int pageNo, int pageSize);
	
}
