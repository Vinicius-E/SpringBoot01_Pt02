package com.udemy.SpringBoot01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.SpringBoot01.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
