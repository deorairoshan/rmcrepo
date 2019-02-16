package com.rmc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmc.beans.User;
import com.rmc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		Iterable<User> iterable = userRepository.findAll();
		ArrayList<User> users = new ArrayList<User>();
		iterable.forEach(user -> users.add(user));
		return users;
	}

	@Override
	public User getUserById(int id) {
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public User validateUser(String userName, String password) {
		return null;// userRepository.findById(userName, password);
	}

	@Override
	public int saveUser(User user) {
		User newUser = userRepository.save(user);
		return newUser.getId();
	}

	@Override
	public int updateUser(User user) {
		User newUser = userRepository.save(user);
		return newUser.getId();
	}

	@Override
	public int deleteUser(int id) {
		userRepository.deleteById(id);
		return id;
	}
}
