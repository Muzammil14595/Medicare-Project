package com.simplilearn.backend.service;

import java.util.List;

import com.simplilearn.backend.dto.Registerdto;
import com.simplilearn.backend.dto.SignIndto;
import com.simplilearn.backend.entiry.Customer;

public interface CustomerService {

	public Customer register(Customer customer);
	public Customer login(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer getCust(int id);
	public void updateProfile(int id, Customer cust);
	public void deleteCustomer(int id);
	
}
