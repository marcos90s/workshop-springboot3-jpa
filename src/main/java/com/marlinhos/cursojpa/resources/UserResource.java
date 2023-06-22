package com.marlinhos.cursojpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlinhos.cursojpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findaAll(){
		User u = new User(1L, "Maria","maria@gmail", "9999999", "12515521");
		return ResponseEntity.ok().body(u);
	}
}
