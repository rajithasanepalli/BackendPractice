package com.vbmart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vbmart.dto.UserDTO;
import com.vbmart.exception.BadRequestException;

@Service
public interface UserService {

 UserDTO saveUserDetails(UserDTO userDTO) throws BadRequestException;

	 
	 UserDTO findByUserId(int userId) throws BadRequestException;

	  List<UserDTO> findByAllUser();
}
