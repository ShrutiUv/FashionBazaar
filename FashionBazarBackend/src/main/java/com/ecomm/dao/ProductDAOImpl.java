package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.ecomm.Model.Product;


@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	
	public boolean addProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean deleteProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean updateProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public Product getProduct(int productId)
	{
		Session session=sessionFactory.openSession();             
		Product product=session.get(Product.class, productId);  
		session.close();
		return product;
	}

	
	public List<Product> listProducts()     
	
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");   //Query query=sessionFactory.getCurrentSession().createQuery("from Product")
		
		List<Product> productList=query.list();
		session.close();
		return productList;
	}
	
	
	
	public List<Product> getProductListCategorywise(int categoryId)
	{
	try {
			System.out.println("000088888"+categoryId);
			Query q=sessionFactory.getCurrentSession().createQuery("from Product where categoryId="+categoryId);
			List<Product> productList=q.list();

			return productList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;			
		} 
		
	}
}
	
	





