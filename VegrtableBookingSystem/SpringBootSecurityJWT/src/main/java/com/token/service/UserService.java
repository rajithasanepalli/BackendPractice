package com.token.service;

import org.springframework.stereotype.Service;

import com.token.model.User;

@Service
public interface UserService {
	Integer saveUser(User user);

}
