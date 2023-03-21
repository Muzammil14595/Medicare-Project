package com.simplilearn.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.entiry.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	
	@Query("from Product p where p.name=:name")
	public Product findByName(String name);

}
