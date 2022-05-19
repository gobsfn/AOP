package com.example.email.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.email.emailsender.service.EmailSenderService;

@RestController
public class EmailController {
	
	@Autowired
    private EmailSenderService emailSenderService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {
		return null;

       
    }

}
