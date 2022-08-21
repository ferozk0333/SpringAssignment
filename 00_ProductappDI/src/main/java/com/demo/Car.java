package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehical{

	@Autowired
	public void move() {
		System.out.println("moving in a car");	
	}

}
