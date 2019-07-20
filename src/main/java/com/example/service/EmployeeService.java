package com.example.service;

import com.example.model.Employee;

public interface EmployeeService {
	public Employee findUserByEmail(String email);
	public void saveUser(Employee user);
}
