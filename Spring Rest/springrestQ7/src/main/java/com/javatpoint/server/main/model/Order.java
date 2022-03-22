package com.javatpoint.server.main.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	@Id
	String orderID;
	String item;
	long quantity;
	long price;

	public Order(String item, long quantity, long price) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [item=" + item + ", quantity=" + quantity + ", price=" + price + "]";
	}

}