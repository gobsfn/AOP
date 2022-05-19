package com.example.afterthrowing.service.impl;

import com.example.afterthrowing.model.Account;

// Interface koji baca grešku ako customer id nije pronađen
public interface AccountService {
	
	public abstract Account getAccountByCustomerId(String customerId) throws Exception;

}
