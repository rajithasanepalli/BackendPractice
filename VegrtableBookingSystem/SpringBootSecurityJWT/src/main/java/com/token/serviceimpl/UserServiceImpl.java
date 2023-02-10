package com.token.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.token.model.User;
import com.token.repository.UserRepository;
import com.token.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public Integer saveUser(User user) {
		return  userRepository.save(user).getUserId();
		
	}

}
