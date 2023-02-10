package com.vbmart.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.vbmart.dto.VegetableDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Vegetable;

@Service
public interface VegetableService {
	 VegetableDTO saveVegetable(VegetableDTO vegetableDTO);
		 VegetableDTO findByVegetableId(long vegetableId) throws BadRequestException ;
	  VegetableDTO updateVegetable (VegetableDTO vegetableDTO) throws BadRequestException;
	  List<VegetableDTO> getAll();
	  List<Vegetable> getPaginationVegetable(int pageNo, int pageSize);
	  

}
