package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EMSController {

	EMSService service;

	public EMSController(EMSService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/createemployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return service.createEmployee(employee);
	}
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/getemployeebyid")
	public Employee getEmployeeById(@RequestParam("id") int id) {
		return service.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteemployee")
	public void deleteEmployee(@RequestParam("id") int id) {
		service.deleteEmployee(id);

	}
}
