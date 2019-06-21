package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.Model.PlaceOrder;


@Repository("orderDAO")
@Transactional
public class OrderDAOImpl implements OrderDAO 
    {
	
	@Autowired
	SessionFactory sessionFactory;


	public boolean addOrder(PlaceOrder order) 
	{
		
		try
		{
			sessionFactory.getCurrentSession().save(order);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteOrder(PlaceOrder order) 
	{
		
		try
		{
			sessionFactory.getCurrentSession().delete(order);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public PlaceOrder getOrder(int orderId)
	{
	
		Session session=sessionFactory.openSession();    
		PlaceOrder order=session.get(PlaceOrder.class, orderId);
		session.close();
		return order;
	}

	public List<PlaceOrder> getOrderList() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from PlaceOrder");
		List<PlaceOrder> orderList=query.list();
		session.close();
		return orderList;
	}

}
