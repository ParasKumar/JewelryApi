package com.example.service;

import java.util.List;

import com.example.entity.User;


public interface IUserService {
	User saveUser(User user);
	User findByUserName(User use);
	List<User> getAllUsers();
}
