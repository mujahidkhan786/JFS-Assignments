package com.javatpoint.server.main.Servies;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.server.main.model.Order;
import com.javatpoint.server.main.repository.OrderRepository;



@Service
public class OrderServies {
	@Autowired
	private OrderRepository orderRepository;

	// create operation
	public Order place(String item, long quantity, long price) {
		return orderRepository.save(new Order(item, quantity, price));
	}

	// Retrieve operations
	public Order getByItem(String item) {
		return orderRepository.findByitem(item);
	}

	public List<Order> getAll() {
		return orderRepository.findAll();
	}

	public List<Order> getByPrice(long price) {
		return orderRepository.findByprice(price);
	}

	// update operations
	public Order update(String item, long quantity, long price) {
		Order order = orderRepository.findByitem(item);
		order.setQuantity(quantity);
		order.setPrice(price);
		return orderRepository.save(order);
	}

	// Delete Operations
	public void deleteAll() {
		orderRepository.deleteAll();
	}

	public void deleteByItem(String item) {
		Order order = orderRepository.findByitem(item);
		orderRepository.delete(order);
	}

}

