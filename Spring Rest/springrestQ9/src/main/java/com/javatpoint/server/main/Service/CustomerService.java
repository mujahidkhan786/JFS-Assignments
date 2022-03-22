package com.javatpoint.server.main.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.server.main.Repository.CustomerRepository;
import com.javatpoint.server.main.model.Customer;


@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public Customer create(String firstName, String lastName, String street, String city, String state, String country,
			long zipcode) {
		return customerRepository.save(new Customer(firstName, lastName, street, city, state, country, zipcode));
	}

	public List<Customer> fetchAll() {
		return customerRepository.findAll();
	}

	public Customer fetchByName(String firstName, String lastName) {
		return customerRepository.findByFirstName(firstName, lastName);
	}

	public Customer update(String firstName, String lastName, String street, String city, String state, String country,
			long zipcode) {
		Customer customer = customerRepository.findByFirstName(firstName, lastName);
		customer.setCity(city);
		customer.setCountry(country);
		customer.setState(state);
		customer.setStreet(street);
		customer.setZipcode(zipcode);
		return customerRepository.save(customer);
	}

	public String deleteByName(String firstName, String lastName) {
		Customer customer = customerRepository.findByFirstName(firstName, lastName);
		customerRepository.delete(customer);
		return "Deleted Customer " + firstName + " " + lastName;
	}
}