package com.example.around.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	public void dispalyBalance(String accNum) {
		System.out.println("Inside displayBalance() method");
		
		if (accNum.equals("99999")) {
			System.out.println("Total balance: 10,000");
		} else {
			System.out.println("Sorry! wrong account number.");  
		}
	}

}
