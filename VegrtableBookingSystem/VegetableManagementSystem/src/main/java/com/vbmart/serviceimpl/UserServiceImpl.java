package com.vbmart.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbmart.dto.UserDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.User;
import com.vbmart.repository.UserRepository;
import com.vbmart.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDTO saveUserDetails(UserDTO userDTO) throws BadRequestException {
User user = modelMapper.map(userDTO, User.class);
		
		user = userRepository.save(user);

		return modelMapper.map(user, UserDTO.class);
	}

	@Override
	public UserDTO findByUserId(int userId) throws BadRequestException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> findByAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
