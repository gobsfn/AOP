package com.example.jdbcdatabaseFinaOnline.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbcdatabaseFinaOnline.data.Banka;
import com.example.jdbcdatabaseFinaOnline.repository.BankaRepository;

@Service
public class BankaService {
	
	@Autowired
	BankaRepository bankaRepository;
	
	public List<Banka> getAllBanka(){
		
		return bankaRepository.getAll();
	}
	
	public String addBanka(Banka banka) {
		if (bankaRepository.addBank(banka)) {
			return "Uspješno ste dodali banku";
		}
		else {
			return "Negdje je pošlo po krivu";
		}
	}

}
