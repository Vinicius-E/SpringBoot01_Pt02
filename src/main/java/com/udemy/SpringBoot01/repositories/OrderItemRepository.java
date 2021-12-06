package com.udemy.SpringBoot01.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.SpringBoot01.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
 