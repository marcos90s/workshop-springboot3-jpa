package com.marlinhos.cursojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhos.cursojpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
