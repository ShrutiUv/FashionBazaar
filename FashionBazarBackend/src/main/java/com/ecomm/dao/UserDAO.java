package com.ecomm.dao;


import java.util.List;

import com.ecomm.Model.Product;
import com.ecomm.Model.UserDetails;

public interface UserDAO {
	public boolean addUser(UserDetails user);
	public boolean deleteUser(UserDetails user);
	public boolean updateUser(UserDetails user);
	
	public UserDetails getUserDetails(String userName);
	public List<UserDetails> UserList();
	
	

}
