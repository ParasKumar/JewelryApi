package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.IUserService;


@RestController
public class WelcomeController {
	@Autowired
	IUserService iUserService;

	@RequestMapping("/")
	public String loadSinginForm(Map<String, Object> map) {
		
	   return "index";
	}
	@RequestMapping(value="/signIn",method=RequestMethod.POST)
	public ResponseEntity<User> userSignIn(@RequestBody User user) {
		User user1=iUserService.findByUserName(user);		
	   return new ResponseEntity<User>(user1, HttpStatus.OK);
	}
	
}
