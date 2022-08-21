package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike implements Vehical{

	@Autowired
	public void move() {
		System.out.println("moving on a bike");	
	}

}
