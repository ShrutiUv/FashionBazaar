package com.ecomm.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.Model.Cart;

@Repository("cartDAO")
@Transactional
public class CartDAOImpl implements CartDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addToCart(Cart cart) {
		
		try
		{
			/*List<Cart> cartItemList=this.listCartItems(cart.getUserName());  //If product added twice it will just change quantity
			if(cartItemList.size()>0)
			{
				int count=0,flag=0;
				while(count<cartItemList.size())
				{
					if(cartItemList.get(count).getProductId()==cart.getProductId())
					{
						Cart cart1=cartItemList.get(count);
						cart1.setQuantity(cart1.getQuantity()+cart.getQuantity());
						this.updateCartItem(cart1);
						return true;
					}
					count++;
				}
			}*/
			
			sessionFactory.getCurrentSession().save(cart);
			return true;
		}catch(Exception e)
		{
		return false;
		}
	}

	public boolean deleteItemFromCart(Cart cart)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		}catch(Exception e)
		{
		return false;
		}
	}

	public boolean updateCartItem(Cart cart) {
		try
		{
			sessionFactory.getCurrentSession().update(cart);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}
	}

	public Cart getCartItem(int cartId) 
	{
		Session session=sessionFactory.openSession();
		Cart cart=session.get(Cart.class, cartId);
		session.close();
		return cart;
	}

	public List<Cart> listCartItems(String username)
	{
		List<Cart> cl=null;
		Session session=sessionFactory.openSession();
		try {
			
			cl=session.createQuery("from Cart where userName='"+username+"'").list();
			for(Cart c:cl)System.out.println(c);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cl;
	}
	
	public boolean deletCartByUser(String username) {
		Session session=sessionFactory.openSession();

		try {
			
			List<Cart> cl=listCartItems(username);
			for(Cart c:cl) {
				sessionFactory.getCurrentSession().delete(c);

			}
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	return false;
	}

}

