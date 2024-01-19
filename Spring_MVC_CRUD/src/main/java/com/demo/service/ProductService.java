package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	int save(Product p);
	List<Product> showAll();
	Product showById(int id);
	int editById(Product p);
	int removeById(int id);
}
