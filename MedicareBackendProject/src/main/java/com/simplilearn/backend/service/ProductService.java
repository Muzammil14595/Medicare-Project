package com.simplilearn.backend.service;

import java.util.List;

import com.simplilearn.backend.dto.Productdto;
import com.simplilearn.backend.entiry.Category;
import com.simplilearn.backend.entiry.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	public Product getProductByName(String name);
	public Product getProductById(int id);
	public void addProduct(Productdto productdto, Category category);
	public void updProduct(int id, Productdto productdto);
	public void delProduct(int id);
}
