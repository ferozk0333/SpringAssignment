package com.productapp.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "product_table")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private BigDecimal price;
	private boolean isAvailable;
	
	public Product(Integer id,String name, BigDecimal price, boolean isAvailable) {
		this.id=id;
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
}
