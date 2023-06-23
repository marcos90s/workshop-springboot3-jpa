package com.marlinhos.cursojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhos.cursojpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
