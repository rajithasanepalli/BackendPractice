package com.vbmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbmart.dto.OrderVegetableDTO;
import com.vbmart.model.OrderVegetable;

public interface OrderVegetableRepository extends JpaRepository<OrderVegetable, Long> {
	OrderVegetable save(OrderVegetableDTO orderVegetableDTO);
	OrderVegetable findByOrderVegetableId(long orderVegetableId);
	
	

}
