package com.javatpoint.server.main.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Customer;



@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByFirstName(String firstName, String lastName);
}