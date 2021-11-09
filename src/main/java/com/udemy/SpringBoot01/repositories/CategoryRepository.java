package com.udemy.SpringBoot01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.SpringBoot01.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
