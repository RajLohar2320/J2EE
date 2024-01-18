package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;

public class ProductControllerMVC {
	@Autowired
	private ProductService psrvc;
	
	@GetMapping("/getproducts")
	public ModelAndView getProducts(HttpSession session) {
		   List<Product> plist=psrvc.getAllProducts();
		   return new ModelAndView("displayproduct","plist",plist);
		
	}
	
	@GetMapping("/addproduct")
	public String displayaddform(HttpSession session) {
		  return "addproduct";
		
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProduct(@RequestParam int pid, @RequestParam String pname,@RequestParam int qty,@RequestParam double price) {
		Product p=new Product(pid, pname, price, qty);
		psrvc.addnewProduct(p);
		return new ModelAndView("redirect:/product/getproducts");
		
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable("id") int pid) {
		Product p=psrvc.getById(pid);
		return new ModelAndView("editProduct","p",p);
		
	}
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProdut(@RequestParam int pid, @RequestParam String pname,@RequestParam int qty,@RequestParam double price) {
		psrvc.updateById(new Product(pid, pname, price, qty));
		return new ModelAndView("redirect:/product/getproducts");
	}
	
	@GetMapping("delete/{id}")
	public ModelAndView deleteProduct(@PathVariable int id) {
		psrvc.deleteById(id);
		return new ModelAndView("redirect:/product/getproducts");
	}
	
	@GetMapping("/products/price/{lpr}/{hpr}")
	public ModelAndView getProductByprice(@PathVariable int lpr,@PathVariable int hpr) {
		List<Product> plist=psrvc.getByPrice(lpr,hpr);
		return new ModelAndView("displayproduct","plist",plist);
	}
}
