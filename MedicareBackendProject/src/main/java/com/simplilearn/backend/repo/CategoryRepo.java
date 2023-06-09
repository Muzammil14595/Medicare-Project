package com.simplilearn.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.backend.entiry.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
	public Category getCategoryByName(String name);

}
