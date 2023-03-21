package com.simplilearn.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.backend.entiry.Orders;
import com.simplilearn.backend.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo ordrepo;

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return ordrepo.findAll();
	}

	@Override
	public Orders getOrderById(int id) {
		// TODO Auto-generated method stub
		return ordrepo.findById(id).get();
	}

	@Override
	public void addOrder(Orders order) {
		// TODO Auto-generated method stub
		ordrepo.save(order);
	}

}
