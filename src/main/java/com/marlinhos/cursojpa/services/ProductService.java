package com.marlinhos.cursojpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlinhos.cursojpa.entities.Product;
import com.marlinhos.cursojpa.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	public Product findById(Long id) {
	Optional<Product> obj = repository.findById(id);
	return obj.get();
	}
}
