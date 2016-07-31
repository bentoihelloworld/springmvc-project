package com.bentoi.ai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}



	@RequestMapping("/add")
	public ModelAndView addProducts() {
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView("addproduct");
		mv.addObject("productDao",  new ProductDao());
		mv.addObject("prdct", new Products());
		return mv;
	}
	
	@RequestMapping("/list")
	public ModelAndView showProducts() {
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView("products");
		mv.addObject("productDao",  new ProductDao());
		return mv;
	}

}
