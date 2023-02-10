package com.vbmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.vbmart.dto.VegetableDTO;

import com.vbmart.model.Vegetable;

public interface VegetableRepository  extends JpaRepository<Vegetable,Long> {
	
	Vegetable save(VegetableDTO vegetableDto);
	
	Vegetable findByVegetableId(long vegetableId);

}
