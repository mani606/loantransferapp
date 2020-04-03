package com.fund.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fund.demo.model.UserRegistration;

@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Long> {
	UserRegistration findByid(Long id);
}