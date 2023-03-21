package com.simplilearn.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.backend.entiry.Category;
import com.simplilearn.backend.entiry.Product;
import com.simplilearn.backend.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepo repo;

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		repo.save(category);
	}

	@Override
	public void updCategory(int id, Category cat) {
		
		if(repo.findById(id).isPresent()) {
			
			Category oldCat = repo.findById(id).get();
			oldCat.setName(cat.getName());
			
			repo.save(oldCat);
		}

	}

	@Override
	public void delCategory(int id) {
		
		repo.deleteById(id);	
	}

	@Override
	public Category getCategoryByName(String name) {
		// TODO Auto-generated method stub
		return repo.getCategoryByName(name);
	}

}
