package com.example.aop.service;

import org.springframework.stereotype.Service;

import com.example.aop.model.Employee;

@Service
public class EmployeeService {
	
	public Employee createEmployee(String empId, String fname, String lname) {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setFirstName(fname);
		emp.setLastName(empId);
		
		return emp;
	}
	
	public void deleteEmployee(String empId) {
		
	}

}
