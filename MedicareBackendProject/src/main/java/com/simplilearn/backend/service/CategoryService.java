package com.simplilearn.backend.service;

import java.util.List;

import com.simplilearn.backend.entiry.Category;


public interface CategoryService {
	
	public List<Category> getAllCategories();
	public Category getCategoryByName(String name);
	public Category getCategoryById(int id);
	public void addCategory(Category cat);
	public void updCategory(int id, Category cat);
	public void delCategory(int id);

}
