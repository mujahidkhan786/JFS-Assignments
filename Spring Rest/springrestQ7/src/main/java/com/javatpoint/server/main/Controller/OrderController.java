package com.javatpoint.server.main.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.Servies.OrderServies;
import com.javatpoint.server.main.model.Order;


@RestController
public class OrderController {
	@Autowired
	private OrderServies orderServies;

	@PostMapping("/place")
	public String place(@RequestParam String item, @RequestParam long quantity, @RequestParam long price) {
		Order order = orderServies.place(item, quantity, price);
		return order.toString();
	}

	@GetMapping("/showByName")
	public Order getByItem(@RequestParam String item) {
		return orderServies.getByItem(item);
	}

	@GetMapping("/showAll")
	public List<Order> getAll() {
		return orderServies.getAll();
	}

	@GetMapping("/showByPrice")
	public List<Order> getByPrice(@RequestParam long price) {
		return orderServies.getByPrice(price);
	}

	@PutMapping("/edit")
	public String update(@RequestParam String item, @RequestParam long quantity, @RequestParam long price) {
		Order order = orderServies.update(item, quantity, price);
		return order.toString();
	}

	@DeleteMapping("/deleteByItem")
	public void deleteByItem(@RequestParam String item) {
		orderServies.deleteByItem(item);
		System.out.println("Deleted Item : " + item);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		orderServies.deleteAll();
		System.out.println("Deleted all orders");
	}

}