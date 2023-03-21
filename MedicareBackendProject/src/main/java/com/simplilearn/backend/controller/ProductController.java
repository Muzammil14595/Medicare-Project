package com.simplilearn.backend.controller;

import java.util.List;
import java.util.Optional;

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

import com.simplilearn.backend.dto.Productdto;
import com.simplilearn.backend.entiry.Category;
import com.simplilearn.backend.entiry.Product;
import com.simplilearn.backend.repo.CategoryRepo;
import com.simplilearn.backend.service.ProductService;

@RestController
@RequestMapping("/api/product")
@CrossOrigin("http://localhost:4200/")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@PostMapping("")
	public void addProduct(@RequestBody Productdto productdto){
		Category category = categoryRepo.findById(productdto.getCategoryId()).get();
		
			productService.addProduct(productdto, category);
		}
		
	@GetMapping("")
	public List<Product> getAll(){
		return productService.getAllProducts();
	}
	
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
//	@PostMapping("/getByName")
//	public ResponseEntity<Object> getProductByName(@RequestBody Product prod) {
//		
//		Product product = productService.getProductByName(prod);
//		if(product!= null) {
//			return new ResponseEntity<Object>(product,HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<Object>("Product Not Found", HttpStatus.NOT_FOUND);
//		}
//	}
	
	@GetMapping("/getByName/{name}")
	public ResponseEntity<Object> getProductByName(@PathVariable String name) {
		
		Product product = productService.getProductByName(name);
		if(product!= null) {
			return new ResponseEntity<Object>(product,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Object>("Product Not Found", HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delProduct(@PathVariable int id) {
		productService.delProduct(id);
	}
	
	@PutMapping("/{id}")
	public void updProduct(@PathVariable int id, @RequestBody Productdto productdto) {
		productService.updProduct(id, productdto);		
	}
	
}
