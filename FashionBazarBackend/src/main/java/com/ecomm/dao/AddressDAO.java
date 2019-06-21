package com.ecomm.dao;

import java.util.List;

import com.ecomm.Model.Address;

public interface AddressDAO {
	
	public boolean addAddress(Address a);
	public boolean updateAddress(Address a);
	public boolean deleteAddress(Address a);
	public Address getAddress(int addressId);
	public List<Address> listAddress();

}
