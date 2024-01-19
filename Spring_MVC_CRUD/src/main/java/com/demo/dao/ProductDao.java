package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {
	int insert(Product p);
	List<Product> getAll();
	Product getById(int id);
	int updateById(Product p);
	int deleteById(int id);
}
