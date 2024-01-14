package com.gl.EmployeeManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.EmployeeManagementApp.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
