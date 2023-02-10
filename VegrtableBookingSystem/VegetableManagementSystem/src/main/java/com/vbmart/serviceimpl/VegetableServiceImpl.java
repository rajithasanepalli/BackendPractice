package com.vbmart.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vbmart.dto.VegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Vegetable;
import com.vbmart.repository.VegetableRepository;
import com.vbmart.service.VegetableService;

@Service
public class VegetableServiceImpl implements VegetableService{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private VegetableRepository vegetableRepository;

	@Override
	@Transactional
	public VegetableDTO saveVegetable(VegetableDTO vegetableDTO) {
		
	Vegetable vegetable=modelMapper.map(vegetableDTO, Vegetable.class);
		vegetable=vegetableRepository.save(vegetable);
		return modelMapper.map(vegetable, VegetableDTO.class);
		
	}

	@Override
	public VegetableDTO findByVegetableId(long vegetableId) throws BadRequestException {
		
		VegetableDTO vegetableDTO=null;
		Vegetable vegetable =vegetableRepository.findByVegetableId(vegetableId);
		if(vegetable !=null) {
			vegetableDTO=modelMapper.map(vegetable, VegetableDTO.class);
		}
		return vegetableDTO;
	}

	@Override
	public VegetableDTO updateVegetable(VegetableDTO vegetableDTO) throws BadRequestException {
		Vegetable vegetable=modelMapper.map(vegetableDTO,Vegetable.class);
		vegetable=vegetableRepository.save(vegetable);
		return modelMapper.map(vegetable, VegetableDTO.class);
	}

	@Override
	public List<VegetableDTO> getAll() {	
		List<VegetableDTO> vegetableDTOs=new ArrayList<>();
		List<Vegetable> vegetables=(List<Vegetable>) vegetableRepository.findAll();
		for(Vegetable vegetable:vegetables) {
			VegetableDTO vegetableDTO=modelMapper.map(vegetable, VegetableDTO.class);
			vegetableDTOs.add(vegetableDTO);
		}
		return vegetableDTOs;
	}

	@Override
	public List<Vegetable> getPaginationVegetable(int pageNo, int pageSize) {
//		
		Pageable pagination=PageRequest.of(pageNo, pageSize);
		Page<Vegetable> pageResult=vegetableRepository.findAll(pagination);
		if(pageResult.hasContent()) {
			return pageResult.getContent();
		}
		else {
			return new ArrayList<Vegetable>();
		}
		
	}

}
