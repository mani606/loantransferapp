package com.fund.demo.service;

import java.util.List;

import com.fund.demo.model.UserRegistration;

public interface UserService {

	List<UserRegistration> getAllUsers();

	UserRegistration getUserRegistrationById(Long id);
	void delete(Long id);

	void update(UserRegistration users);




	void save(UserRegistration users);










}
