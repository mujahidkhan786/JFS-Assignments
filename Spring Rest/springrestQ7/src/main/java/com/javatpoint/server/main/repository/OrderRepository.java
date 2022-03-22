package com.javatpoint.server.main.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

	public Order findByitem(String item);

	public List<Order> findByprice(long price);

	public List<Order> findByquantity(long quantity);

}
