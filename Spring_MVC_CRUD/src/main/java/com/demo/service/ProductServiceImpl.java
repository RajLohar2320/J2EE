package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pdao;

	@Override
	public int save(Product p) {
		return pdao.insert(p);
	}

	@Override
	public List<Product> showAll() {
		return pdao.getAll();
	}

	@Override
	public Product showById(int id) {
		return pdao.getById(id);
	}

	@Override
	public int editById(Product p) {
		return pdao.updateById(p);
	}

	@Override
	public int removeById(int id) {
		return pdao.deleteById(id);
	}
}
