package com.skg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skg.demo.repository.UserRepository;

@Service("userServiceImplName")
public class UserServiceImplName implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void getUsers() {
		System.out.println("User Service Implementation Name User");
		
	}
	

}
