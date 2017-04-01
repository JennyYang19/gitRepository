package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.repository.UserRepository;

@RestController
@RequestMapping("/hello")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/findOne/{id}")
	public User findById(@PathVariable Long id){
		User user = userRepository.findOne(id);
		return user;
	}
	@GetMapping("/sad")
	public String sad(){
		
		return "what's wrong with you";
	}
}
