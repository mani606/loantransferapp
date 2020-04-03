package com.fund.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fund.demo.model.UserRegistration;

public interface UserRepository extends JpaRepository<UserRegistration, Long> {
	UserRegistration findByid(Long id);
}