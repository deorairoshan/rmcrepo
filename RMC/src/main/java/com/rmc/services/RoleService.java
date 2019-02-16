package com.rmc.services;

import java.util.List;

import com.rmc.beans.Role;
import com.rmc.beans.User;

public interface RoleService {

	public List<Role> getAllRoles();

	public void assignRole(List<User> users, Role role);

	public Role getRoleById(int id);

	public int saveRole(Role role);

	public int updateRole(Role role);

	public int deleteRole(int id);

}
