package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//没有明确角色
@Component("myUser")
public class User {

	@Autowired
  private UserService userService;
	public void show(){
		System.out.println("==========");
		System.out.println(userService);
	}
}
