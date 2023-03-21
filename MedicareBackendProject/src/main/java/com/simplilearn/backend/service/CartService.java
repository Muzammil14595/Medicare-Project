package com.simplilearn.backend.service;

import java.util.List;

import com.simplilearn.backend.dto.AddToCartdto;
import com.simplilearn.backend.entiry.Cart;
import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.entiry.Product;


public interface CartService {
	
	public List<Cart> getAllCart();
	public Cart getCartById(int id);
	//public List<Cart> getCartByCustId(int id);
	public void addToCart(AddToCartdto addToCartdto, Customer customer);
	public void updCart(int id, AddToCartdto addToCartdto);
	public void delCart(int id);

}
