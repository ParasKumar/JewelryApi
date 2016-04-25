package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repositories.IUserRepository;
import com.example.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	IUserRepository iUserRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		
		return iUserRepository.saveAndFlush(user);
	}

	@Override
	public User findByUserName(User user) {
		// TODO Auto-generated method stub
		User user1=iUserRepository.findByUserName(user.getUserName());
		if(user1.getPassword().equals(user.getPassword())){
			return user1;
		}
		else{
			return null;
		}
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return iUserRepository.findAll();
	}

}
