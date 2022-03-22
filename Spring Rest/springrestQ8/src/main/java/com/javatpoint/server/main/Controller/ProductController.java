package com.javatpoint.server.main.Controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.Service.ProductService;
import com.javatpoint.server.main.model.Product;



@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/order")
	public String order(String name, float cost, Date mDate) {
		Product product = productService.orderProduct(name, cost, mDate);
		return product.toString();
	}

	@GetMapping("/getOrderbyName")
	public Product findbyName(String name) {
		return productService.findbyName(name);
	}

	@GetMapping("/getAllOrders")
	public List<Product> findAll() {
		return productService.findAll();
	}

	@GetMapping("/getOrderbyPrice")
	public List<Product> findByPrice(float cost) {
		return productService.findByCost(cost);
	}

	@GetMapping("/getOrderbyDate")
	public List<Product> findByDate(Date date) {
		return productService.findByDate(date);
	}

	@PutMapping("/updateOrder")
	public String update(String name, float cost, Date mDate) {
		Product product = productService.update(name, cost, mDate);
		return product.toString();
	}

	@DeleteMapping("/deleteOrder")
	public void delete(String name) {
		productService.deleteByName(name);
	}

}