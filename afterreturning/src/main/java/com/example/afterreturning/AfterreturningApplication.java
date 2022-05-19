package com.example.afterreturning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.afterreturning.model.Account;
import com.example.afterreturning.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AfterreturningApplication {

	public static void main(String[] args) {

		/**
		 * ConfigurableApplicationContext is an interface that provides facilities to configure an application context in 
		 * addition to the application context client methods in the ApplicationContext.
		 */
		ConfigurableApplicationContext ac = SpringApplication.run(AfterreturningApplication.class, args); 
		AccountServiceImpl accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
		
		Account account;
		
		try {
			account = accountService.getAccountByCustomerId("K2434567");
			
			if (account != null) {
				System.err.println(account.getaNumber() + "\t" + account.getaType());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
