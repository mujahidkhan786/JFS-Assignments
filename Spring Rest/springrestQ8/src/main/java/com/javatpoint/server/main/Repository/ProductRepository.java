package com.javatpoint.server.main.Repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Product;



@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	public Product findByName(String name);

	public List<Product> findByCost(float cost);

	public List<Product> findByMDate(Date date);

}