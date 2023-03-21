package com.simplilearn.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.backend.entiry.Category;
import com.simplilearn.backend.service.CategoryService;

@RestController
@RequestMapping("/api/category")
@CrossOrigin("http://localhost:4200/")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@PostMapping("")
	public void addCategory(@RequestBody Category category){
		
		service.addCategory(category);
		
	}
	@GetMapping("")
	public List<Category> getAll(){
		return service.getAllCategories();
	}
	
	
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable int id) {
		return service.getCategoryById(id);
	}
	
	@GetMapping("/byName/{name}")
	public Category getCategoryByName(@PathVariable String name) {
		return service.getCategoryByName(name);
	}
	
	
	@DeleteMapping("/{id}")
	public void delCategory(@PathVariable int id) {
		service.delCategory(id);
	}
	
	@PutMapping("/{id}")
	public void updCategory(@PathVariable int id, @RequestBody Category cat) {
		service.updCategory(id, cat);		
	}

}
