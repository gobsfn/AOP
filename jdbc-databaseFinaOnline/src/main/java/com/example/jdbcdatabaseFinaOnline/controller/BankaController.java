package com.example.jdbcdatabaseFinaOnline.controller;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.jdbcdatabaseFinaOnline.data.Banka;
import com.example.jdbcdatabaseFinaOnline.service.BankaService;

@RestController

public class BankaController {
	
	@Autowired
	BankaService bankaService;
	
	@PostMapping("/add")
	public String addBanka(@RequestBody Banka banka) {
		return bankaService.addBanka(banka);
		
	}
	
	

}
