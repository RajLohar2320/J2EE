package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import com.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService psrvc;
	
	@GetMapping("/getproducts")
	public ModelAndView getproducts(HttpSession s) {
		User u = (User)s.getAttribute("user");
		if(u != null) {
			List<Product> plist = psrvc.showAll();
			for(Product p: plist)
			{
				System.out.println(p);
			}
			return new ModelAndView("Products", "plist", plist);
		}
		return new ModelAndView("redirect:/login/");
	}

}
