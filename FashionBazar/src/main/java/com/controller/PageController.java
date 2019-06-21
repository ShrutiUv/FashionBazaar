package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.Model.Category;
import com.ecomm.Model.Product;
import com.ecomm.Model.UserDetails;
import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.ProductDAO;


@Controller
public class PageController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	
	@RequestMapping(value= {"/","index","home"} )
	public ModelAndView home() {
		ModelAndView m=new ModelAndView("index");
		
		List<Product> productList=productDAO.listProducts(); 
		m.addObject("productList", productList);
		
		List<Category> categoryList=categoryDAO.listCategories();
		m.addObject("categoryList", categoryList);
		
		
		return m;
	}
	
	
	@RequestMapping(value="login")
	public ModelAndView loginPage() {
		
		return new ModelAndView("Login");
	}
	
	@RequestMapping(value="register")
	public ModelAndView registerPage() {
		
		return new ModelAndView("Register");
	}
	
	
	
	
	}
	
	
	
	
	
	
	

