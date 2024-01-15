package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {
	int save (Product p);
	List<Product> getAll();
	int deleteById(int pid);
	int updateById(int pid);
	Product getById(int pid);
}
