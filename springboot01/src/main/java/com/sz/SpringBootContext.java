package com.sz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringBootContext implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	private static ApplicationContext ctx;
	
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		ctx = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
		return ctx;
	}
	
	
 

}
