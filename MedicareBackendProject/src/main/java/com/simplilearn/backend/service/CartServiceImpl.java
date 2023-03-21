package com.simplilearn.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.backend.dto.AddToCartdto;
import com.simplilearn.backend.entiry.Cart;
import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.entiry.Product;
import com.simplilearn.backend.repo.CartRepo;


@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepo repo;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CustomerService customerService;

	@Override
	public void addToCart(AddToCartdto addToCartdto, Customer customer) {
		// validate if the productId is valid
		Product product = productService.getProductById(addToCartdto.getProductId());
		
		Cart cart = new Cart();
		cart.setProduct(product);
		cart.setCustomer(customer);
		cart.setQuantity(addToCartdto.getQuantity());
		cart.setTotalCost(addToCartdto.getQuantity()*product.getPrice());
		//save the cart
		repo.save(cart);
		
	}
	
	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cart getCartById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	
//	@Override
//	public List<Cart> getCartByCustId(int id){
//		
//		Customer customer = customerService.getCust(id);
//		
//		return repo.findByCust(customer);
//
//	}

	@Override
	public void updCart(int id, AddToCartdto addToCartdto) {
		// TODO Auto-generated method stub
		if(repo.findById(id).isPresent()) {
			
			Cart oldCart = repo.findById(id).get();
			oldCart.setQuantity(addToCartdto.getQuantity());
			repo.save(oldCart);
		}

	}

	@Override
	public void delCart(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	

}
