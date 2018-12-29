package com.test.controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.beans.Employee;
import com.test.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/test")
	public String test() {
		return "Test success..";
	}

	@GetMapping("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		logger.info("Get all employees method called.");
		return employeeService.getAll();
	}

	@GetMapping("/get")
	public Employee getEmployee(@RequestParam int id) {
		logger.info("Get employees method called. {}", id);
		return employeeService.get(id);
	}

	@PostMapping("/save")
	public int insertEmployee(@RequestBody Employee employee) {
		logger.info("Save employees method called. {}", employee);
		employeeService.save(employee);
		return employee.getId();
	}

	@PostMapping("/update")
	public int updateEmployee(@RequestBody Employee employee) {
		logger.info("Update employees method called. {}", employee);
		employeeService.update(employee);
		return employee.getId();
	}

	@PostMapping("/delete")
	public int deleteEmployee(@RequestBody int id) {
		logger.info("Delete employees method called. {}", id);
		employeeService.delete(id);
		return id;
	}

}
