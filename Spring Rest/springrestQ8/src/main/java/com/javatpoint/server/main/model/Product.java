package com.javatpoint.server.main.model;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	String productID;
	String name;
	float cost;
	Date mDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	public Product(String name, float cost, Date mDate) {
		super();
		this.name = name;
		this.cost = cost;
		this.mDate = mDate;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", mDate=" + mDate + "]";
	}

}