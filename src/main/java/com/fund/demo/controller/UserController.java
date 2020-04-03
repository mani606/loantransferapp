package com.fund.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fund.demo.model.UserRegistration;
import com.fund.demo.repository.UserRepository;
import com.fund.demo.service.UserService;



@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	UserRepository userrepository;



	@GetMapping("/user")  
	private List<UserRegistration> getAllusers()   
	{  
		return userService.getAllUsers();  
	}  

	@GetMapping("/user/{id}")  
	private UserRegistration getUsers(@PathVariable("id") Long id)   
	{  

		return userService.getUserRegistrationById(id);  
	}  
	
	@DeleteMapping("/user/{id}")  
	private void deleteUser(@PathVariable("id") Long id)   
	{  
		userService.delete(id);  
	}  
	
	@PostMapping("/users")  
	private Long saveUser(@RequestBody UserRegistration users)   
	{  
		userService.save(users);  
		return users.getId();  
	}  
	
	@PutMapping("/users")  
	private UserRegistration update(@RequestBody UserRegistration users)   
	{  
		userService.update(users);  
		return users;  
	}  


	

	
	}


