package com.vbmart.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vbmart.dto.OrderVegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.OrderVegetable;
import com.vbmart.repository.OrderVegetableRepository;
import com.vbmart.service.OrderVegetableService;

@Service
public class OrderVegetableServiceImpl implements OrderVegetableService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private OrderVegetableRepository orderVegetableRepository;
	
	
	@Override
	public OrderVegetableDTO saveOrderVegetable(OrderVegetableDTO orderVegetableDTO) throws BadRequestException {
		OrderVegetable orderVegetable=modelMapper.map(orderVegetableDTO,OrderVegetable.class);
		orderVegetable=orderVegetableRepository.save(orderVegetable);
		return modelMapper.map(orderVegetable,OrderVegetableDTO.class );
		
		
	}

	@Override
	public OrderVegetableDTO updateOrderVegetable(OrderVegetableDTO orderVegetableDTO) throws BadRequestException {
	OrderVegetable orderVegetable=modelMapper.map(orderVegetableDTO, OrderVegetable.class);
	orderVegetable=orderVegetableRepository.save(orderVegetable);
		return modelMapper.map(orderVegetable, OrderVegetableDTO.class);
	}

	@Override
	public OrderVegetableDTO getOrderVegetableById(long orderVegetableId) throws BadRequestException {
		OrderVegetableDTO orderVegetableDTO=null;
		OrderVegetable orderVegetable=orderVegetableRepository.findByOrderVegetableId(orderVegetableId);
		if(orderVegetable!=null) {
			orderVegetableDTO=modelMapper.map(orderVegetable, OrderVegetableDTO.class);
		}
		return orderVegetableDTO;
	}

	@Override
	public List<OrderVegetableDTO> getall() {
		List<OrderVegetableDTO>orderVegDTOS=new ArrayList<>();
		List<OrderVegetable> orderVegetables=(List<OrderVegetable>) orderVegetableRepository.findAll();
		for(OrderVegetable orderVegetable:orderVegetables) {
			OrderVegetableDTO orderVegetableDTO=modelMapper.map(orderVegetable, OrderVegetableDTO.class);
			orderVegDTOS.add(orderVegetableDTO);
		}
		return orderVegDTOS;
	}

	@Override
	public List<OrderVegetable> getPaginationOrderVegetable(int pageNo, int pageSize) {
		Pageable pagination=PageRequest.of(pageNo, pageSize);
		Page<OrderVegetable>pagedResult=orderVegetableRepository.findAll(pagination);
		if(pagedResult.hasContent()) {
			return pagedResult.getContent();
		}
		else {
		return new ArrayList<OrderVegetable>();
		}
		
	}

}
