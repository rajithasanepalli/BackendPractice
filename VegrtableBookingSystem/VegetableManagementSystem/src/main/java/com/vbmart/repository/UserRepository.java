package com.vbmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbmart.dto.UserDTO;
import com.vbmart.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	  User save(UserDTO userDTO);
		
		//public User save(User user);


		  User findByUserId(int userId);

}
