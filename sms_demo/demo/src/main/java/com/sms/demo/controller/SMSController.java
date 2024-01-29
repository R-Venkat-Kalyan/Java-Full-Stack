package com.sms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sms.demo.service.SMSService;

@Controller
public class SMSController {
	
	@Autowired
	private SMSService service;
	
	
	@GetMapping("/")
    public String showForm() {
        return "sms_form";
    }

    @PostMapping("/send-sms")
    public String sendSms(@RequestParam("phoneNumber") String phoneNumber) {
        String message = "Welcome to our application! Thank you for signing up.";
        service.sendMessage(phoneNumber, message);
        return "sms_confirmation";
    }

}
