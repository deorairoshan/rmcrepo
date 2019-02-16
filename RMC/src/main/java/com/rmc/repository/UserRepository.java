package com.rmc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rmc.beans.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	// public User findById(String userName, String password);
}
