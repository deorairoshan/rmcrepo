package com.rmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rmc.beans.User;
import com.rmc.services.UserService;

@RestController
@RequestMapping("/rmc/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId") int userId) {
		return userService.getUserById(userId);
	}

	@PostMapping
	public int saveUser(@RequestParam User user) {
		return userService.saveUser(user);
	}

	@PutMapping
	public int updateUser(@RequestParam User user) {
		return userService.saveUser(user);
	}

	@DeleteMapping("/{userId}")
	public int deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}
