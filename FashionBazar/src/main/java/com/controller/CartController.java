package com.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.Model.Cart;

import com.ecomm.Model.Product;
import com.ecomm.Model.UserDetails;
import com.ecomm.dao.CartDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.dao.UserDAO;

@Controller
public class CartController {

	@Autowired
	UserDAO userDAO;
	
	@Autowired
	ProductDAO productDAO;

	@Autowired
	CartDAO  cartDAO; 
	
	@RequestMapping(value="addToCart{productId}")   
	public String addToCart(@PathVariable("productId")int productId,Model m,HttpSession session)
	{
		
		String userName=(String)session.getAttribute("userName");
		Cart c=new Cart();

		
		UserDetails user=userDAO.getUserDetails(userName);
		Product p=productDAO.getProduct(productId);
		c.setProduct(p);
		c.setUser(user);
		
		
		boolean b=cartDAO.addToCart(c);
		
		
		
		return "redirect:home";
	}
	
	@RequestMapping("cartList")
	public ModelAndView cartList(HttpSession session) {
		ModelAndView mv=new ModelAndView("cartList");
		
		String userName=(String)session.getAttribute("userName");
		
		List<Cart> clist=cartDAO.listCartItems(userName);
		mv.addObject("clist",clist);
		
		return mv; 
	}
	
	
	
	@RequestMapping(value="deleteCart{productId}")
	public String deleteCartItem(@PathVariable("productId")int productId,Model m,HttpSession session)
	{
		Cart cart=cartDAO.getCartItem(productId);
		boolean b=cartDAO.deleteItemFromCart(cart);	
		return "redirect:cartList";
	}
}




	
	
	
	
