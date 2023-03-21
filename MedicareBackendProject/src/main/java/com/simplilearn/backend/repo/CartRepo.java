package com.simplilearn.backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.backend.entiry.Cart;
import com.simplilearn.backend.entiry.Customer;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer>{
	
	//public List<Cart> findByCust(Customer customer);

}
