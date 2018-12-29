package com.test.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.test.beans.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Map<Integer, Employee> employeeDetails = new HashMap<>();

	public EmployeeRepositoryImpl() {
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setFirstName("Roshan");
		emp1.setLastName("Deorai");
		emp1.setEmail("deorairoshan@gmail.com");
		emp1.setPhone("9665975525");
		emp1.setAddress("Pune");
		employeeDetails.put(101, emp1);

		Employee emp2 = new Employee();
		emp2.setId(102);
		emp2.setFirstName("Peter");
		emp2.setLastName("Parker");
		emp2.setEmail("peterparker@gmail.com");
		emp2.setPhone("1234567890");
		emp2.setAddress("NewYork");
		employeeDetails.put(102, emp2);
	}

	public List<Employee> getAll() {
		return new ArrayList<Employee>(employeeDetails.values());
	}

	public Employee get(int empId) {
		return employeeDetails.get(empId);
	}

	public void save(Employee employee) {
		if (employee.getId() <= 0) {
			throw new IllegalArgumentException("Employee id is incorrect.");
		}
		employeeDetails.put(employee.getId(), employee);
	}

	public void update(Employee employee) {
		if (!employeeDetails.containsKey(employee.getId())) {
			throw new IllegalArgumentException("Employee not present.");
		}
		employeeDetails.put(employee.getId(), employee);
	}

	public void delete(int id) {
		if (!employeeDetails.containsKey(id)) {
			throw new IllegalArgumentException("Employee not present.");
		}
		employeeDetails.remove(id);
	}
}
