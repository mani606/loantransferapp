package com.fund.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.demo.model.UserRegistration;
import com.fund.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired  
	UserRepository userrepository;  
	 
	@Override
	public List<UserRegistration> getAllUsers() {
		List<UserRegistration> users=new ArrayList<UserRegistration>();  
		userrepository.findAll().forEach(users1 -> users.add(users1));  
		return users;  
	}

	@Override
	public UserRegistration getUserRegistrationById(Long id) {
		return userrepository.findById(id).get();  // TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		userrepository.deleteById(id);
		
	}

	@Override
	public void update(UserRegistration users) {
		userrepository.save(users);  
		
	}

	@Override
	public void save(UserRegistration users) {
		//booksRepository.save(books);  
	}

}
