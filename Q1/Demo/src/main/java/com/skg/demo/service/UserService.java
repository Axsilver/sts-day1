package com.skg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skg.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	DepartmentService departmentService;
	
	UserRepository userRepository;
	
	
	@Autowired
	UserService(UserRepository userRepository)
	{
		this.userRepository = new UserRepository();
	}
	
	public void getUsers()
	{
		userRepository.addUser("Bob");
		departmentService.getUsers();
		userRepository.getUsers();
	}
}
