package com.example.afterreturning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.example.afterreturning.model.Account;

@Aspect
@Component
public class AccountAspect {
	
	// Oznaka "account" koju definiramo u returning atributu mora biti iste oznake kao parametar u metodi advicea. Inace se nece pokrenuti.
	@AfterReturning(value = "execution(* com.example.afterreturning.service.impl.AccountServiceImpl.*(..))", returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint, Account account) {
		
		System.out.println("After Returing method:" + joinPoint.getSignature());
		System.out.println(account);
	}
	

}
