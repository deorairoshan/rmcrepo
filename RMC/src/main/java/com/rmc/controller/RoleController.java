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

import com.rmc.beans.Role;
import com.rmc.services.RoleService;

@RestController
@RequestMapping("/rmc/api/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping
	public List<Role> getAllUsers() {
		return roleService.getAllRoles();
	}

	@GetMapping("/{roleId}")
	public Role getUserById(@PathVariable("roleId") int roleId) {
		return roleService.getRoleById(roleId);
	}

	@PostMapping
	public int saveRole(@RequestParam Role role) {
		return roleService.saveRole(role);
	}

	@PutMapping
	public int updateRole(@RequestParam Role role) {
		return roleService.saveRole(role);
	}

	@DeleteMapping("/{roleId}")
	public int deleteRole(@PathVariable int id) {
		return roleService.deleteRole(id);
	}
}
