package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.model.Employee;
import com.example.aop.service.EmployeeService;


/* URL za pozvat u browseru
 * http://localhost:8080/add/employee?empId=NekiID&firstName=NekoIme&lastName=NekoPrezime
 * http://localhost:8080/remove/employee?empId=NekiID
 */

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/add/employee")
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
		
		mohito();
		loko();
		bivas();
		
		return employeeService.createEmployee(empId, firstName, lastName);
	}
	
	@GetMapping(value = "/remove/employee")
	public String removeEmployee(@RequestParam("empId") String empId) {
		employeeService.deleteEmployee(empId);
		return "Employee deleted";
	}
	
	// Test for @dumy things
	@GetMapping(value = "/doup")
	public String nekaMetoda() {
		System.out.println("okinula se neka metoda");
		
		return "XXXXX";
	}
	
	@Bean
	public void mohito() {
		System.out.println("______________________________");
	}
	
	@Bean
	public void loko() {
		System.out.println("______________________________");
	}
	
	@Bean
	public void bivas() {
		System.out.println("______________________________");
	}
	

}
