package com.example.afterthrowing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.afterthrowing.model.Account;
import com.example.afterthrowing.service.impl.AccountService;
import com.example.afterthrowing.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AfterthrowingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AfterthrowingApplication.class, args);
		
		/**
		 * ConfigurableApplicationContext is an interface that provides facilities to configure an application context in 
		 * addition to the application context client methods in the ApplicationContext.
		 */
		ConfigurableApplicationContext applicationContext = SpringApplication.run(AfterthrowingApplication.class, args);
		
		// Dohvat account objekta iz konteksta aplikacije
		AccountServiceImpl accountService = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);
		
		Account account;
		try {
			// Generiranje exceptiona
			account = accountService.getAccountByCustomerId(null);
			
			if (account != null) {
				System.out.println(account.getaNumber() + "\t" + account.getaType()); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
