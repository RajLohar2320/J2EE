package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService psrvc;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getproducts() {
		List<Product> plist = psrvc.showAll();
		return ResponseEntity.ok(plist);
	}
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> getById(@PathVariable int pid){
		Product p = psrvc.showById(pid);
		if(p != null)
			return ResponseEntity.ok(p);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
		
	@PostMapping("/products/{pid}")
	public ResponseEntity<String> insertProduct(@RequestBody Product p) {
		psrvc.insert(p);
		return ResponseEntity.ok("Product Added Successfully");
	}
	
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> editProduct(@RequestBody Product p) {
		psrvc.upById(p);
		return ResponseEntity.ok("Product Updated Successfully");
	}
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid) {
		psrvc.delById(pid);
		return ResponseEntity.ok("Product Deleted Successfully");
	}
}
