package com.simplilearn.backend.service;

import java.util.List;

import com.simplilearn.backend.entiry.Orders;


public interface OrderService {
	
	public List<Orders> getAllOrders();
	public Orders getOrderById(int id);
	public void addOrder(Orders order);
//	public void updProduct(int id, Product prod);
//	public void delProduct(int id);
//	public Order getOrderByCustId(int custId);

}
