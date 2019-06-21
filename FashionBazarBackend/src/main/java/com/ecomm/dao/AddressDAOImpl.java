package com.ecomm.dao;


import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.Model.Address;



@Repository
@Transactional
public class AddressDAOImpl implements AddressDAO {

	@Autowired    //@Autowired - create object implicitly
	SessionFactory sessionFactory;

	
	public boolean addAddress(Address a) {

		try{
			sessionFactory.getCurrentSession().saveOrUpdate(a);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;			
		}
	}

	public boolean updateAddress(Address a) {
		try{
			sessionFactory.getCurrentSession().update(a);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;			
		}
	}

	public boolean deleteAddress(Address a) {
		try{
			sessionFactory.getCurrentSession().delete(a);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;			
		}

	}

	public Address getAddress(int addressId) {
		try {
			Address addressObj=(Address)sessionFactory.getCurrentSession().get(Address.class, addressId);

			return addressObj;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public List<Address> listAddress() {
		try
		{
			Query q=sessionFactory.getCurrentSession().createQuery("from Address");
			List<Address> addressList=q.list();

			return addressList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;			
		}
	}
}



