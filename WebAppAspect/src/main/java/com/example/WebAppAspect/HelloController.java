package com.example.WebAppAspect;


import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebAppAspect.dodatno.Dodatno;


@RestController
public class HelloController {
	
	@Autowired
	Dodatno dodatno;
	
	private String c = "Oće li proradit...";
	
	
	@GetMapping("/")
	public String index() {
		String d = dumy(c);
		dodatno.dodatnaMetoda();
		return "Greetings from Spring Boot! Pa kako si, nisam te vidio sto godina " + d;
	}
	
	
	@GetMapping("/o")
	public String dumy(String b) {
		System.out.println("Dumy se izvršila");
		return b;
				
	}

}
