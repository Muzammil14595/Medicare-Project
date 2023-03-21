package com.simplilearn.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.backend.dto.AddToCartdto;
import com.simplilearn.backend.entiry.Cart;
import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.repo.CustomerRepo;
import com.simplilearn.backend.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	
	@Autowired
	CartService service;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("")
	public void addToCart(@RequestBody AddToCartdto addToCartdto){
		
		Customer cust = customerRepo.findById(addToCartdto.getCustomerId()).get();
		
		service.addToCart(addToCartdto, cust);
		
	}
	@GetMapping("")
	public List<Cart> getAll(){
		return service.getAllCart();
	}
	
	
	@GetMapping("/{id}")
	public Cart getCartById(@PathVariable int id) {
		return service.getCartById(id);
	}
	
//	@GetMapping("/bycustId/{id}")
//	public List<Cart> getCartByCustId(@PathVariable int id) {
//		return service.getCartByCustId(id);
//	}
	
	@DeleteMapping("/{id}")
	public void delCart(@PathVariable int id) {
		service.delCart(id);
	}
	
	@PutMapping("/{id}")
	public void updCart(@PathVariable int id, @RequestBody AddToCartdto addToCartdto) {
		service.updCart(id, addToCartdto);		
	}

}
