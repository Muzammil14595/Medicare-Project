package com.simplilearn.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin("http://localhost:4200/")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("")
	public ResponseEntity<Object> custRegistration(@RequestBody Customer customer){
		//calling method to save object and taking response in variable named 'created'
		Customer created= service.register(customer);
		if(created!=null)
			return new ResponseEntity<Object>(created,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while creating an object",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object> custlogin(@RequestBody Customer cust){
		//calling method login to save object of Customer and taking response in variable named 'created'
		Customer created= service.login(cust);
		if(created!=null)
			return new ResponseEntity<Object>(created,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("Not Found",
					HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("")
	public List<Customer> getAll(){
		return service.getAllCustomers();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getCust(@PathVariable int id) {
		Customer customer= service.getCust(id);
		if(customer!=null)
			return new ResponseEntity<Object>(customer,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("Not Found",
					HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public void delCust(@PathVariable int id) {
		service.deleteCustomer(id);
	}
	
	@PutMapping("/{id}")
	public void updCust(@PathVariable int id, @RequestBody Customer cust) {
		service.updateProfile(id, cust);		
	}
}
