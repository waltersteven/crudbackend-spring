package com.walterpariona.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walterpariona.model.User;
import com.walterpariona.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	private List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	private User getUser(@PathVariable Long id) {
		return userRepository.getOne(id);
	}
	
	@DeleteMapping("/user/{id}")
	private boolean deleteUser(@PathVariable Long id) {
		User usr = userRepository.getOne(id);
		if (usr == null) return false;
		userRepository.delete(usr);
		return true;
	}
	
	@PostMapping("/user")
	private User createUser(User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/user")
	private User updateUser(User user) {
		return userRepository.save(user);
	}
	
}
