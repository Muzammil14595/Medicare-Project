package com.simplilearn.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.backend.entiry.Orders;
import com.simplilearn.backend.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("")
	public void addOrder(@RequestBody Orders order){
		
		service.addOrder(order);
		
	}
	
	
	@GetMapping("")
	public List<Orders> getAll(){
		return service.getAllOrders();
	}
	
	@GetMapping("/{id}")
	public Orders getOrder(@PathVariable int id) {
		return service.getOrderById(id);
	}
}
