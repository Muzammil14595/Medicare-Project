package com.simplilearn.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.backend.entiry.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	@Query("from Admin a where a.email=:email and a.password=:password")
	public Admin adminLogin(String email, String password);
	
	@Query("from Admin a where a.email=:email")
	public Admin getByEmail(String email);
}
