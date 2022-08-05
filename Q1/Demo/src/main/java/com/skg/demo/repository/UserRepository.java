package com.skg.demo.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	ArrayList<String> users = new ArrayList<String>();
	
	public UserRepository()
	{
	}
	
	public void addUser(String user)
	{
		users.add(user);
	}
	
	public void getUsers()
	{
		for (String user : users)
		{
			System.out.println("Repository User: " +user);
		}
	}
}
