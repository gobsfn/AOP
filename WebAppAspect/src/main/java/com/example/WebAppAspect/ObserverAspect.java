package com.example.WebAppAspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint; // Ovaj je pravi import za JoinPoint
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ObserverAspect {
	
	/*
	 * Before Advice: An advice that executes before a join point, is called before advice. We use @Before annotation to mark an advice as Before advice.
	 */
	@Before("execution(* com.example..*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before se izvršila****************" + joinPoint.toLongString());
		System.out.println("JOINPOINT ----------> " + joinPoint.getSignature());
		
	}
	
	/*
	 * After Advice: An advice that executes after a join point, is called after advice. We use @After annotation to mark an advice as After advice.
	 */
//	@After("execution(* com.example.WebAppAspect.HelloController.*(..))")
//	public void after(JoinPoint joinPoint) {
//		System.out.println("After se izvršila****************" + joinPoint.toLongString());
//		System.out.println(joinPoint.getSignature());
//		 
//	}
	
	
	/*
	 * Around Advice: An advice that executes before and after of a join point, is called around advice.
	 * Izvrsava se samo AROUND ako nije zakomentiran
	 */
//	  @Around("execution(* com.example.WebAppAspect.HelloController.*(..))") public
//	  void around(JoinPoint joinPoint) {
//	  System.out.println("Around se izvršila****************" + joinPoint.toLongString()); 
//	  System.out.println(joinPoint.getSignature();
//	  
//	  }
	  
	  /*
	   * After Throwing Advice: An advice that executes when a join point throws an exception.
	   */
//	  @AfterThrowing("execution(* com.example.WebAppAspect.HelloController.*(..))")
//	  public void afterThrowing(JoinPoint joinPoint) {
//	  System.out.println("AfterThrowing se izvršila****************" + joinPoint.toLongString()); 
//	  System.out.println(joinPoint.getSignature());
//	  
//	  }
	  
	  /*
	   * After Returning Advice: An advice that executes when a method executes successfully.
	   */
//	  @AfterReturning("execution(* com.example.WebAppAspect.HelloController.*(..))"
//	  ) public void afterReturning(JoinPoint joinPoint) {
//	  System.out.println("AfterReturning se izvršila****************" + joinPoint.toLongString()); 
//	  System.out.println(joinPoint.getSignature());
//	  
//	  }
	 
                
}       

/*
 * AOP Terminology

    Aspect: An aspect is a module that encapsulates advice and pointcuts and provides cross-cutting An application can 
    have any number of aspects. We can implement an aspect using regular class annotated with @Aspect annotation.
    
    Pointcut: A pointcut is an expression that selects one or more join points where advice is executed. We can define 
    pointcuts using expressions or patterns. It uses different kinds of expressions that matched with the join points. 
    In Spring Framework, AspectJ pointcut expression language is used.
    
    Join point: A join point is a point in the application where we apply an AOP aspect. Or it is a specific execution 
    instance of an advice. In AOP, join point can be a method execution, exception handling, changing object variable value, etc.
    
    Advice: The advice is an action that we take either before or after the method execution. The action is a piece of code 
    that invokes during the program execution. There are five types of advices in the Spring AOP framework: before, after, 
    after-returning, after-throwing, and around advice. Advices are taken for a particular join point. We will discuss these 
    advices further in this section.
    
    Target object: An object on which advices are applied, is called the target object. Target objects are always a proxied 
    It means a subclass is created at run time in which the target method is overridden, and advices are included based on 
    their configuration.
    
    Weaving: It is a process of linking aspects with other application types. We can perform weaving at run time, load time, 
    and compile time.
    
    Proxy: It is an object that is created after applying advice to a target object is called proxy. The Spring AOP implements 
    the JDK dynamic proxy to create the proxy classes with target classes and advice invocations. These are called AOP proxy classes.
    
    
 */
        