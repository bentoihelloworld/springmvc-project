package com.bentoi.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bentoi.ai.ProductDao;
import com.bentoi.ai.ProductDaoImpl;
import com.bentoi.ai.model.Products;

@Controller
public class ProductController {

	@Autowired
	private ProductDao product;

	String message = "Welcome to Spring MVC!";

	/*
	 * @RequestMapping("/hello") public ModelAndView showMessage(
	 * 
	 * @RequestParam(value = "name", required = false, defaultValue = "World")
	 * String name) { System.out.println("in controller");
	 * 
	 * ModelAndView mv = new ModelAndView("helloworld"); mv.addObject("message",
	 * message); mv.addObject("name", name); return mv; }
	 */
	/**
	 * Bind all product list
	 * */
	@ModelAttribute("listProducts")
	public List<Products> populateDepartments() {
		List<Products> prodList = product.getAllProducts();
		return prodList;
	}

	@RequestMapping("/add")
	public ModelAndView addProducts() {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("addproduct");
		mv.addObject("productDaoImpl", new ProductDaoImpl());
		mv.addObject("prdct", new Products());
		return mv;
	}

	@RequestMapping("/list")
	public ModelAndView showProducts() {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("products");
		mv.addObject("productDaoImpl", new ProductDaoImpl());
		return mv;
	}

}
