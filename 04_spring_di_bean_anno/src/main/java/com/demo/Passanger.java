package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Passanger {
	private String name;
	private Vehical vehical;

	@Autowired
	public Passanger(String name, Vehical vehical) {
		super();
		this.name = name;
		this.vehical = vehical;
	}
	public String getName() {
		return name;
	}
	public Vehical getVehical() {
		return vehical;
	}
	public Passanger() {
		System.out.println("ctr of passanger is called");
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("name: " + name);
		vehical.move();
	}
}
