package com.JavaDev.MyFirstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JavaDev.MyFirstProject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
