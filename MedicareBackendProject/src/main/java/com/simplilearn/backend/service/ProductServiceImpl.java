package com.simplilearn.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.backend.dto.Productdto;
import com.simplilearn.backend.entiry.Category;
import com.simplilearn.backend.entiry.Product;
import com.simplilearn.backend.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo prodRepo;
	
	@Override
	public void addProduct(Productdto productdto, Category category) {
		Product product = new Product();
		
		product.setName(productdto.getName());
		product.setCompany(productdto.getCompany());
		product.setPrice(productdto.getPrice());
		product.setCategory(category);
		prodRepo.save(product);

	}

	public Productdto getProductdto(Product product) {
		Productdto productdto = new Productdto();
		
		productdto.setId(product.getId());
		productdto.setName(product.getName());
		productdto.setCompany(product.getCompany());
		productdto.setPrice(product.getPrice());
		productdto.setCategoryId(product.getCategory().getId());
		return productdto;
	}
	
	@Override
	public List<Product> getAllProducts() {

		return prodRepo.findAll();
	}

	@Override
	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return prodRepo.findByName(name);
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id).get();
	}

//	@Override
//	public void updProduct(int id, Productdto productdto) {
//		if(prodRepo.findById(id).isPresent()) {
//			
//			Product oldProduct = prodRepo.findById(id).get();
//			oldProduct.setName(productdto.getName());
//			oldProduct.setCompany(productdto.getCompany());
//			oldProduct.setPrice(productdto.getPrice());
//			
//			prodRepo.save(oldProduct);
//		}
//
//	}
	
	@Override
	public void updProduct(int id, Productdto productdto) {
		if(prodRepo.findById(id).isPresent()) {
			
			Product oldProduct = prodRepo.findById(id).get();
			oldProduct.setName(productdto.getName());
			oldProduct.setCompany(productdto.getCompany());
			oldProduct.setPrice(productdto.getPrice());
			
			prodRepo.save(oldProduct);
		}

	}

	@Override
	public void delProduct(int id) {
		prodRepo.deleteById(id);

	}

}
