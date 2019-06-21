package com.ecomm.dao;

import java.util.List;



import com.ecomm.Model.PlaceOrder;

public interface OrderDAO 
{
	public boolean addOrder(PlaceOrder order);
	public boolean deleteOrder(PlaceOrder order);

	public PlaceOrder getOrder(int orderId);
	public List<PlaceOrder> getOrderList();

}
