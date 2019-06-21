package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.Model.UserDetails;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	
	
	public boolean addUser(UserDetails user) {
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
		


	
	public boolean deleteUser(UserDetails user) {
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}


	
	public boolean updateUser(UserDetails user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	
	public UserDetails getUserDetails(String username) {
		Session session=sessionFactory.openSession();
		UserDetails user=session.get(UserDetails.class, username);
		session.close();
		return user;
	}


	
	public List<UserDetails> UserList() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from UserDetails");
		
		List<UserDetails> productList=query.list();
		session.close();
		return productList;
	}
			}

	



