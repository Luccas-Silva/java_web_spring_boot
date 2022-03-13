package com.JavaDev.MyFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.JavaDev.MyFirstProject.entities.Category;
import com.JavaDev.MyFirstProject.repositories.CategoryRepository;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
