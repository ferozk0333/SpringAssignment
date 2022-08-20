package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.AppConfig;
@Configuration
public class Main {
	
	public static void main(String[] args) {

		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Passanger passanger=(Passanger) ctx.getBean("p");
	
		passanger.travel();
		
		((AbstractApplicationContext) ctx).close();
	}

}





