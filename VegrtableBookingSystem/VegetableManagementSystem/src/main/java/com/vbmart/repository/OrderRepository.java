package com.vbmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbmart.dto.OrderDTO;
import com.vbmart.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
Order save(OrderDTO orderDTO);
Order findByOrderId(long orderId);

}
