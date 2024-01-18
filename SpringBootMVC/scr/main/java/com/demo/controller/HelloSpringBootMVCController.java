package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringBootMVCController {
	@GetMapping("/")
	public String sayHello(Model m) {
		m.addAttribute("msg", "Welcome to Hello Page");
		return "Hello";
	}
}
