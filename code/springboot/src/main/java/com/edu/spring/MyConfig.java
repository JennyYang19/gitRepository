package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

	@Bean(name="myyBean")
	//多例 .....
	@Scope("prototype")
	public MyBean createMyBean(){
		return new MyBean();
	} 
	
	
	@Bean
	public RunnableFactoryBean createFactoryBean(){
		return new RunnableFactoryBean();
	}
	
	@Bean 
	public CarFactory createCarFactory(){
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory factory){
		return factory.createCar();
	}
	
	@Bean
	public Cat createCat( ){
		return new Cat();
	}
	@Bean
	public Animal createAnimal( ){
		return new Animal();
	}
	@Bean
	public User createUser( ){
		return new User();
	}
	              
	
	@Bean(initMethod="init",destroyMethod="destory")
	public Dog createDog( ){
		return new Dog();
	}
}
