package com.rmc.services;

import java.util.List;

import com.rmc.beans.User;

public interface UserService {

	public List<User> getAllUsers();

	public User getUserById(int id);

	public User validateUser(String userName, String password);

	public int saveUser(User user);

	public int updateUser(User user);

	public int deleteUser(int id);

}
