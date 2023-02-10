package com.vbmart.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vbmart.dto.OrderDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Order;
import com.vbmart.repository.OrderRepository;
import com.vbmart.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired OrderRepository orderRepository;
	@Override
	public OrderDTO saveOrderDetails(OrderDTO orderDTO) throws BadRequestException {
		Order order=modelMapper.map(orderDTO, Order.class);
		order=orderRepository.save(order);
		return modelMapper.map(order, OrderDTO.class);
	}

	@Override
	public OrderDTO getOrder(long orderId) throws BadRequestException {
	OrderDTO orderDTO=null;
	Order order=orderRepository.findByOrderId(orderId);
	if(order!=null) {
		orderDTO=modelMapper.map(order, OrderDTO.class);
	}
		return orderDTO;
	}

	@Override
	public OrderDTO updateOrder(OrderDTO orderDTO) throws BadRequestException {
		Order order = modelMapper.map(orderDTO, Order.class);
		order = orderRepository.save(order);

		return modelMapper.map(order,OrderDTO.class);
	}

	@Override
	public List<OrderDTO> getAll() {
		List<OrderDTO> orderDTOs = new ArrayList<>();
		List<Order> orders = (List<Order>) orderRepository.findAll();
		for (Order order : orders) {
		OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
			orderDTOs.add(orderDTO);
		}
		return orderDTOs;
	}

	@Override
	public List<Order> getPaginationOrder(int pageNo, int pageSize) {
		Pageable pagination = PageRequest.of(pageNo, pageSize);
		Page<Order> pagedResult =orderRepository.findAll(pagination);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {

			return new ArrayList<Order>();

		}
	}

	
	
	}


