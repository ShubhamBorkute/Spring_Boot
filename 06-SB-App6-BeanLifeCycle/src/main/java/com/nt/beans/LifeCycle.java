package com.nt.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class LifeCycle implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init() :: Call");
		
	}

	
}
