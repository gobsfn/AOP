package com.example.afterthrowing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {
	
	// Oznaka "ex" koju definiramo u throwing atributu mora biti iste oznake kao parametar u metodi advicea. Inace se nece pokrenuti.
	@AfterThrowing(value = "execution(* com.example.afterthrowing.service.impl.AccountServiceImpl.*(..))", throwing = "ex")
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
		
		System.out.println("After Throwing exception in method:" + joinPoint.getSignature());
		System.out.println("Exception is:" + ex.getMessage());
	}

}
