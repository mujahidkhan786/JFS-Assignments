package com.javatpoint.server.main.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.Service.CustomerService;
import com.javatpoint.server.main.model.Customer;


@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	public String create(String firstName, String lastName, String street, String city, String state, String country,
			long zipcode) {
		Customer customer = customerService.create(firstName, lastName, street, city, state, country, zipcode);
		return customer.toString();
	}

	@GetMapping("/fetchAll")
	public List<Customer> fetchAll() {
		return customerService.fetchAll();
	}

	@GetMapping("/fetchByName")
	public Customer fetchByName(String firstName, String lastName) {
		return customerService.fetchByName(firstName, lastName);
	}

	@PutMapping("/update")
	public String update(String firstName, String lastName, String street, String city, String state, String country,
			long zipcode) {
		Customer customer = customerService.update(firstName, lastName, street, city, state, country, zipcode);
		return customer.toString();
	}

	@DeleteMapping("/delete")
	public void deleteByName(String firstName, String lastName) {
		customerService.deleteByName(firstName, lastName);
	}

}