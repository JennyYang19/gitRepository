package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//业务逻辑层
@Service	
public class UserService {
	@Autowired
	private UserDao userDao;

	
	public void show(){
		System.out.println("=======show=======");
		System.out.println(userDao);
	}
}
