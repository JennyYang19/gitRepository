package com.edu.spring;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Jeep> {

	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	public Class<Jeep> getObjectType() {
		return Jeep.class;
	}

	public boolean isSingleton() {
		return true;
	}

	
}
