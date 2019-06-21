/*package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.Model.Supplier;
import com.ecomm.Model.UserDetails;
import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.UserDAO;

public class UserDAOTest {
	static UserDAO userDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");     //Bean initialization 
	}
	@Ignore
	@Test
	public void addUserTest()
	{
		UserDetails user=new UserDetails();
		user.setUserName("Raj");
		user.setPassword("555");
		user.setEmailId("raj@gmail.com");
		user.setCustomerName("Raj Kumar");
		user.setEnabled(false);    
		user.setRole("ROLE_USER");
		user.setAddress("H.No-40/50,Thane,Mumbai");
		
		assertTrue("Problem in Adding user",userDAO.addUser(user));
		}
	@Ignore
	@Test
	public void deleteUserTest()
	{
		UserDetails user=userDAO.getUserDetails("Sandy2");
		assertTrue("Problem in Deleting UserDetails",userDAO.deleteUser(user));
	}
	
	
	@Ignore
	@Test
	public void updateUserTest()
	{
		UserDetails user=userDAO.getUserDetails("Raj");
		user.setEmailId("raj123@gmail.com");
		assertTrue("Problem in Updating UserDetails",userDAO.updateUser(user));
	}
	
	@Ignore
	@Test
	public void userListTest()
	{
	List<UserDetails> listUser=userDAO.UserList();
	assertTrue("Problem in Listing Categories",listUser.size()>0);
	for(UserDetails user:listUser)
	{
		System.out.println(user.getUserName()+":::");
		System.out.println(user.getEmailId()+":::");
		System.out.println(user.getAddress()+":::");
		System.out.println(user.getCustomerName()+":::");
		System.out.println(user.getRole()+":::");
		System.out.println(user.isEnabled()+":::");
	}
	
		
	}
	
	}
		
		
		
	


*/