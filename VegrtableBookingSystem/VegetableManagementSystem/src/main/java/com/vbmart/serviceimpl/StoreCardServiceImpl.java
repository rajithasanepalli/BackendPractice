package com.vbmart.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbmart.dto.StoreCardDTO;
import com.vbmart.model.StoreCard;
import com.vbmart.repository.StoreCardRepository;
import com.vbmart.service.StoreCardService;

@Service
public class StoreCardServiceImpl implements StoreCardService {
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StoreCardRepository storeCardRepository;  

	@Override
	public StoreCardDTO save(StoreCardDTO storeCardDTO) {
		StoreCard storeCard=modelMapper.map(storeCardDTO, StoreCard.class);
		return null;
	}

	@Override
	public List<StoreCardDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
