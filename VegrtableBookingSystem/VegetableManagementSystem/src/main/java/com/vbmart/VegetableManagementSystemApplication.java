package com.vbmart;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing
public class VegetableManagementSystemApplication {
//	@Autowired
//	private BCryptPasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(VegetableManagementSystemApplication.class, args);
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String password = "smilys";
//		String encodedPassword = passwordEncoder.encode(password);
//		System.out.println();
//		System.out.println("Password is         : " + password);
//		System.out.println("Encoded Password is : " + encodedPassword);
//		System.out.println();
//
//		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
//		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);
//
//		password = "yawin";
//		isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
//		System.out.println("Password : " + password + "           isPasswordMatch    : " + isPasswordMatch);
	
//		BCryptPasswordEncoder b=new BCryptPasswordEncoder();
//		String encode=b.encode("smilys");
//		System.out.println(encode);
	}
	@Bean
	public ModelMapper modelMapper() {
	 return new ModelMapper();
	}

}
