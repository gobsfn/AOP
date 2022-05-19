package com.example.afterreturning.service.impl;

import com.example.afterreturning.model.Account;

// Interface koji baca grešku ako customer id nije pronađen
public interface AccountService {
	
	public abstract Account getAccountByCustomerId(String customerId) throws Exception;

}
