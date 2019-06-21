package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.Model.Address;
import com.ecomm.Model.Cart;
import com.ecomm.Model.PlaceOrder;
import com.ecomm.Model.Product;
import com.ecomm.Model.UserDetails;
import com.ecomm.dao.AddressDAO;
import com.ecomm.dao.CartDAO;
import com.ecomm.dao.OrderDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.dao.UserDAO;

@Controller
public class OrderController {

	@Autowired
	CartDAO cartDAO;

	@Autowired
	UserDAO userDAO;

	@Autowired
	AddressDAO addressDAO;

	@Autowired
	ProductDAO productDAO;

	@Autowired
	OrderDAO orderDAO;


	@RequestMapping("buyNow{productName}")
	public ModelAndView buyNow(@PathVariable("productName") String productName,HttpServletRequest request) 
	{
		System.out.println(" Price ----------------  "+productName);

		HttpSession session=request.getSession();
		String userName=(String)session.getAttribute("userName");
		Product p=null;
		List<Product> productList=productDAO.listProducts(); 

		for(Product ps:productList) {
			if(ps.getProductName().equals(productName)) {
				p=ps;
			}
		}

		ModelAndView mv=new ModelAndView("buyProductNow");

		UserDetails user=userDAO.getUserDetails(userName);  //to get address from userDAO
		mv.addObject("user",user);
		int qty=1;
		double totalBill=qty*p.getPrice();


		session.setAttribute("qty", qty);

		session.setAttribute("product", p);
		session.setAttribute("totalBill", totalBill);

		return mv;
	}



	@RequestMapping("byOrder")
	public ModelAndView byOrder(HttpServletRequest request) 
	{
		HttpSession session=request.getSession();
		String userName=(String)session.getAttribute("userName");

		ModelAndView mv=new ModelAndView("addAddress");

		UserDetails user=userDAO.getUserDetails(userName);  //to get address from userDAO
		mv.addObject("user",user);

		double totalBill=0;
		String qty[]=request.getParameterValues("qty");
		String price[]=request.getParameterValues("price");;

		for(int i=0;i<qty.length;i++) {

			totalBill=totalBill+Integer.parseInt(qty[i]) * Double.parseDouble(price[i]);

		}

		session.setAttribute("qty", qty);


		session.setAttribute("totalBill", totalBill);

		System.out.println("Total Bill is : "+totalBill);

		List<Cart> cartList=cartDAO.listCartItems(userName);
		mv.addObject("cartList", cartList);  
		return mv;
	}



	@RequestMapping("addAddress")
	public ModelAndView addAddress(@ModelAttribute("address")Address address,HttpSession session) 
	{

		String userName=(String)session.getAttribute("userName");

		UserDetails user=userDAO.getUserDetails(userName);


		address.setUser(user);
		boolean b=addressDAO.addAddress(address);	

		ModelAndView mv=new ModelAndView("ConfirmPlacedOrder");

		List<Cart> cartList=cartDAO.listCartItems(userName);
		mv.addObject("cartList", cartList);
		mv.addObject("address", address);


		return mv;
	}



	@RequestMapping(value="paymentCart")
	public ModelAndView paymenCarttPage() {

		return new ModelAndView("PaymentCart");
	}

	@RequestMapping(value="paymentBuyNow")
	public ModelAndView paymentBuyNowPage() {

		return new ModelAndView("PaymentBuyNow");
	}

	@RequestMapping(value="receipt")
	public ModelAndView ReceiptPage(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		String userName=(String)session.getAttribute("userName");

		ModelAndView mv=new ModelAndView("Receipt");

		UserDetails user=userDAO.getUserDetails(userName);  //to get address from userDAO
		mv.addObject("user",user);

		List<Cart> cartList=cartDAO.listCartItems(userName);
		mv.addObject("cartList", cartList);

		String status="Processing";
		String orderDate=new Date().toString();
		double totalBill=(double)session.getAttribute("totalBill");


		PlaceOrder order=new PlaceOrder();

		order.setUserName(userName);
		order.setStatus(status);
		order.setOrderDate(orderDate);
		order.setTotalBill(totalBill);

		boolean b= orderDAO.addOrder(order);

		System.out.println("  Java Developer  "+b);
		if(b) {

			System.out.println("check Cart is Clear Or Not  "+cartDAO.deletCartByUser(userName));
		}


		return mv;



	}

	@RequestMapping(value="receiptBuyNow")
	public ModelAndView ReceiptBuyNowPage(HttpServletRequest request)
	{


		HttpSession session=request.getSession();
		String userName=(String)session.getAttribute("userName");

		ModelAndView mv=new ModelAndView("ReceiptBuyNow");

		UserDetails user=userDAO.getUserDetails(userName);  //to get address from userDAO
		mv.addObject("user",user);


		List<Product> productList=productDAO.listProducts();
		mv.addObject("productList",productList);

		String status="Processing";
		String orderDate=new Date().toString();
		double totalBill=(double)session.getAttribute("totalBill");


		PlaceOrder order=new PlaceOrder();

		order.setUserName(userName);
		order.setStatus(status);
		order.setOrderDate(orderDate);
		order.setTotalBill(totalBill);

		boolean b= orderDAO.addOrder(order);



		return mv;
	}

	@RequestMapping(value="orderList")
	public ModelAndView showOrderList()
	{
		ModelAndView m=new ModelAndView("OrderList");
		List<PlaceOrder> orderList=orderDAO.getOrderList();
		m.addObject("orderList",orderList);
		return m;
	}




}

