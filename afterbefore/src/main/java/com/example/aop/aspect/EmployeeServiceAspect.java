package com.example.aop.aspect;
import org.aspectj.lang.JoinPoint; // Ovaj je pravi import za JoinPoint
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.aop.model.Employee;

/* URL za pozvat u browseru
 * http://localhost:8080/add/employee?empId=NekiID&firstName=NekoIme&lastName=NekoPrezime
 * http://localhost:8080/remove/employee?empId=NekiID
 */


@Aspect
@Component
public class EmployeeServiceAspect {
	
//	// Parametrima u @ANOTACIJI moraju odgovarat prrametri u @ADVICEU
//	@Before(value = "execution(* com.example.aop.service.EmployeeService.*(..)) and args(empId, fname, lname)") 
//	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String lname) {
//		System.out.println("Before method:" + joinPoint.getSignature());
//		System.out.println("Creating Employee with first name - " + fname + ", last name - " + lname + " and id - " + empId);
//	}
//	
//	
//
//	
//	// Parametrima u @ANOTACIJI moraju odgovarat prrametri u @ADVICEU
//	@After(value = "execution(* com.example.aop.service.EmployeeService.*(..)) and args(empId)")  
//		public void afterAdvice(JoinPoint joinPoint, String empId) {  
//		System.out.println("After method:" + joinPoint.getSignature());  
//		System.out.println("Removing Employee with id - " + empId);  
//	} 
//	
//	
//	
//	
//	
//	@AfterReturning(value = "execution(* com.example.aop..*(..)) and args(empId, fname, lname)", returning = "employee") 
//	public void afterReturningAdviceTest(JoinPoint joinPoint, String empId, String fname, String lname, Employee employee) {
//		System.out.println("Before method:" + joinPoint.getSignature());
//		System.out.println("Creating Employee ---------> first name - " + fname + ", last name - " + lname + " and id - " + empId + employee.toString());
//	}
	
	// Test for dumy things
	@Around(value = "execution(* com.example.aop.*.*(..))")
		public void afterAround(JoinPoint joinPoint) {
			System.out.println("------------------>  " + joinPoint.getSignature());
		}
	
	
	
}  
	
