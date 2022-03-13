package com.JavaDev.MyFirstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JavaDev.MyFirstProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
