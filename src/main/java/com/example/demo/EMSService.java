package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EMSService {

	EMSRepo repository;

	public EMSService(EMSRepo repository) {
		super();
		this.repository = repository;
	}
	
	public Employee createEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteEmployee(int id) {
		repository.deleteById(id);
	}
}
