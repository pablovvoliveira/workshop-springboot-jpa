package com.pablovvoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablovvoliveira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
