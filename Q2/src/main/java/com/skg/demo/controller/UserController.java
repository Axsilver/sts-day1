package com.skg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skg.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	@Qualifier("userServiceImpl")
	UserService userServiceImpl;
	
	@Autowired
	UserService userServiceImplName;
	
	
	@GetMapping("/test")
	public String getUsers()
	{
		
		userServiceImpl.getUsers();
		return "Success";
	}
}
