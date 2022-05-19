package com.example.afterthrowing.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.afterthrowing.model.Account;

@Service
public class AccountServiceImpl {
	
	private static Map<String, Account> map = null;
	
	static {
		map = new HashMap<String, Account>();
		
		map.put("M4546779", new Account("10441117000", "Saving Account"));
		map.put("K2434567", new Account("10863554577", "Current Account"));
	}
	
	public Account getAccountByCustomerId(String customerId) throws Exception {
		if (customerId == null) {
			throw new Exception("Invalid! Customer Id");
		}
		
		Account account = null;
		Set<Entry<String, Account>> entrySet = map.entrySet();
		for (Entry<String, Account> entry : entrySet) {
			if (entry.getKey().equals(customerId)) {
				account = entry.getValue();
			}
		}
		
		return account;
	}

}
