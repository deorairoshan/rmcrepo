package com.rmc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmc.beans.Role;
import com.rmc.beans.User;
import com.rmc.repository.RoleRepository;
import com.rmc.repository.UserRepository;

@Service
public class RoleServiceImple implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Role> getAllRoles() {
		Iterable<Role> iterable = roleRepository.findAll();
		List<Role> roles = new ArrayList<Role>();
		iterable.forEach(role -> roles.add(role));
		return roles;
	}

	@Override
	public void assignRole(List<User> users, Role role) {
		for (User user : users) {
			user.setRole(role);
			userRepository.save(user);
		}
	}

	@Override
	public Role getRoleById(int id) {
		Optional<Role> optional = roleRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public int saveRole(Role role) {
		Role newRole = roleRepository.save(role);
		return newRole.getId();
	}

	@Override
	public int updateRole(Role role) {
		Role newRole = roleRepository.save(role);
		return newRole.getId();
	}

	@Override
	public int deleteRole(int id) {
		roleRepository.deleteById(id);
		return id;
	}
}
