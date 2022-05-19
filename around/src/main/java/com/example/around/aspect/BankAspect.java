package com.example.around.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Omogucuje e spring AOP funkcionalnost u aplikaciji  
@Aspect
@Component
public class BankAspect {
	
	//Prikazat će se sve metode u BankService klasi
	@Pointcut(value = "within(com.example.around..*)") // ODABIRE FUNKCIJU
	private void logDisplayingBalance() {
		
	}
	//Izvršit će se prije i poslije poziva metode koja odgovara POINTCUT
	@Around(value = "logDisplayingBalance()") // Referiranje na POINTCUT
	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("AROUND -----------> The method aroundAdvice() BEFORE invokation of the method " + jp.getSignature());
		
		try {
			jp.proceed();
		} finally {
			
		}
		
		System.out.println("BEFORE -----------> The method aroundAdvice() AFTER invokation of the method " + jp.getSignature().getName() + " method");
		
	}

}
