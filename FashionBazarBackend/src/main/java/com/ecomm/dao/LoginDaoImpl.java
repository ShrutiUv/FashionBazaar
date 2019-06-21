package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.Model.UserDetails;

@Repository("loginDao")
@Transactional
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SessionFactory sessionFactory;


	public boolean userLogin(String username, String password) {

		try {
			 

			Session session=sessionFactory.openSession();
			List<UserDetails> user=session.createQuery("from UserDetails where userName='"+username+"'  and password='"+password+"'").list();
			
			if(user!=null  ) {
				for(UserDetails u:user) {
					if(u.getUserName().equals(username) && u.getPassword().equals(password))
					return true;
				
				}
			}
			session.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

}
