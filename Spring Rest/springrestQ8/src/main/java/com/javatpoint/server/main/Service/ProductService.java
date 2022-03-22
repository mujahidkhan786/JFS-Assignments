package com.javatpoint.server.main.Service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.server.main.Repository.ProductRepository;
import com.javatpoint.server.main.model.Product;



@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product orderProduct(String name, float cost, Date mDate) {
		return productRepository.save(new Product(name, cost, mDate));
	}

	public Product findbyName(String name) {
		return productRepository.findByName(name);
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public List<Product> findByCost(float cost) {
		return productRepository.findByCost(cost);
	}

	public List<Product> findByDate(Date date) {
		return productRepository.findByMDate(date);
	}

	public Product update(String name, float cost, Date mDate) {
		Product product = productRepository.findByName(name);
		product.setCost(cost);
		product.setmDate(mDate);
		return productRepository.save(product);
	}

	public String deleteAll() {
		productRepository.deleteAll();
		return "All Products Deleted";
	}

	public String deleteByName(String name) {
		Product product = productRepository.findByName(name);
		productRepository.delete(product);
		return "Deleted Product " + name;
	}
}