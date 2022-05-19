package com.example.around;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.around.service.BankService;

@SpringBootApplication
//@EnableAspectJAutoProxy anotacija omogucuje podrsku za upravljanje komponentama oznacenim sa @Aspect. Slicno kao tag u xml konfiguraciji
@EnableAspectJAutoProxy 
public class AroundApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(AroundApplication.class, args);
		
		
		// Dohvat Employee objekta iz aplikacijskog konteksta
		BankService bank = context.getBean(BankService.class);
		
		// Displaying balance in the account 
		// Prikaz stanja racuna po broju racuna
		String accnumber = "99999";
		bank.dispalyBalance(accnumber);
		
		// Closing the context object 
		// ZAtvaranje konteksta
		context.close();
		
		
	}

}
//SpringApplication.run(AroundApplication.class, args);