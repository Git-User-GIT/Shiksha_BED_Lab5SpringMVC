package com.gl.EmployeeManagementApp.service;

import java.util.List;

import com.gl.EmployeeManagementApp.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(int id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(int id);
}