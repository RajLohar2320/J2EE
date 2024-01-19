package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService psrvc;
	
	@GetMapping("/")
	public ModelAndView getProducts() {
		List<Product> plist = psrvc.showAll();
		for(Product p: plist)
		{
			System.out.println(p);
		}
		return new ModelAndView("Products", "plist", plist);
	}
	
	@GetMapping("/addProduct")
	public ModelAndView addProd() {
		return new ModelAndView("AddProduct");
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProd(@RequestParam("pid") int pid, @RequestParam("desc") String desc) {
		Product p = new Product(pid, desc);
		psrvc.save(p);
		return new ModelAndView("redirect:/product/");
	}
	
	@GetMapping("/edit/{pid}")
	public ModelAndView editProd(@PathVariable("pid") int pid) {
		Product p = psrvc.showById(pid);
		return new ModelAndView("EditProduct","p", p);
	}
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProd(@RequestParam("pid") int pid, @RequestParam("desc") String desc) {
		Product p = new Product(pid, desc);
		psrvc.editById(p);
		return new ModelAndView("redirect:/product/");
	}
	@GetMapping("/delete/{pid}")
	public ModelAndView deleteProd(@PathVariable("pid") int pid) {
		psrvc.removeById(pid);
		return new ModelAndView("redirect:/product/");
		
	}
	
}
