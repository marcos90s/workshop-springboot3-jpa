package com.marlinhos.cursojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhos.cursojpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
