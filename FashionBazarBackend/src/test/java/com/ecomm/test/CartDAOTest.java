/*package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.Model.Cart;

import com.ecomm.dao.CartDAO;


public class CartDAOTest
{
	static CartDAO cartDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		cartDAO=(CartDAO)context.getBean("cartDAO");
	}
	//@Ignore
	@Test
	public void addToCartTest()
	{
		Cart cart=new Cart();
		cart.setProductId(4);
		cart.setProductName("Cambridge Men's plain Regular");
		cart.setQuantity(4);
		cart.setPrice(500);
		cart.setStatus("NP");
		cart.setUserName("Raj");
		assertTrue("Problem in Adding Item to Cart",cartDAO.addToCart(cart));
	}
	
	@Ignore
	@Test
	public void updateCartItemTest()
	{
	Cart cart=cartDAO.getCartItem(2);
	cart.setQuantity(5);
	assertTrue("Problem in Updating Item to Cart",cartDAO.updateCartItem(cart));
	}
	
	@Ignore
	@Test
	public void listCartItemTest()
	{
		List<Cart> cartItemList=cartDAO.listCartItems("vinod");
		assertTrue("Problem in Listing CartItems",cartItemList.size()>0);
		
		for(Cart cart:cartItemList)
		{
			System.out.println(cart.getCartId()+":::");
			System.out.println(cart.getProductName()+":::");
			System.out.println(cart.getQuantity()+":::");
		}
		
	}
		
	@Ignore	
	@Test
	public void deleteItemFromCartTest()
	{
	Cart cart=cartDAO.getCartItem(5);
	assertTrue("Problem in Deleting Cart",cartDAO.deleteItemFromCart(cart));
		
	}
	
	
}
*/