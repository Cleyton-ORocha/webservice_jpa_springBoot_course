package com.github.cleytonorocha.webservice_jpa_springBoot.recources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cleytonorocha.webservice_jpa_springBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserRecourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Maria", "maria@gmail.com", "999909","12345");
		return ResponseEntity.ok().body(user);
	}
}
