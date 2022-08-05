package com.skg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skg.demo.service.UserService;

@RestController
public class UserController {

	UserService userService;
	
	@Autowired
	public void setService(UserService userService)
	{
		this.userService = userService;
	}
	
	@GetMapping("/test")
	public String getUsers()
	{
		
		userService.getUsers();
		return "Success";
	}
}
