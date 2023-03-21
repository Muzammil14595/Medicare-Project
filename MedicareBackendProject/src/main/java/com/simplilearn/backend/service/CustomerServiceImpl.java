package com.simplilearn.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.backend.dto.Registerdto;
import com.simplilearn.backend.dto.SignIndto;
import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public Customer register(Customer customer) {
			return repo.save(customer);
	}

	
	@Override
	public Customer login(Customer customer) {
		// TODO Auto-generated method stub
		return repo.findByEmailPass(customer.getEmail(), customer.getPassword());
	}
	
	
	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer getCust(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		return null;
	}

	@Override
	public void updateProfile(int id, Customer cust) {
		
		if(repo.findById(id).isPresent()) {
			
		Customer oldcustomer = repo.findById(id).get();
		oldcustomer.setName(cust.getName());
		oldcustomer.setEmail(cust.getEmail());
		oldcustomer.setPassword(cust.getPassword());
		repo.save(oldcustomer);
		
		}
	}

	@Override
	public void deleteCustomer(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
		}
	}
	
}
