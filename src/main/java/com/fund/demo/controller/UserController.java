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
	@RequestMapping("/")
	public String  message() {
		return "hello";
	}
	@RequestMapping("/helloworld")
	public String  helloWorld() {
		return "hi";
	}
	@RequestMapping("/helloworld/{name}")
	public String  helloWorldName(@PathVariable String name) {
		return "hi  "  +name;
	}

	@RequestMapping("/helloworld/user")
	public UserRegistration getUser() {
		return  new UserRegistration();
	}



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
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/user/{id}")  
	private void deleteUser(@PathVariable("id") Long id)   
	{  
		userService.delete(id);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/users")  
	private Long saveUser(@RequestBody UserRegistration users)   
	{  
		userService.save(users);  
		return users.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/users")  
	private UserRegistration update(@RequestBody UserRegistration users)   
	{  
		userService.update(users);  
		return users;  
	}  


	@RequestMapping("/jpa/user")
	public List<UserRegistration> getUser1() {
		return  userrepository.findAll();
	}

	@GetMapping("/jpa/getuser)")
	public List<UserRegistration> jpagetUser(){
		return userrepository.findAll();

	}
	@GetMapping("/jpa/getuser/{id})")
	public Optional<UserRegistration> jpagetUser(@PathVariable Long id) throws Exception{
		Optional<UserRegistration> user=userrepository.findById(id);
		if(user.isPresent())
			throw new Exception("userid"+id);
		return user;

	}

}
