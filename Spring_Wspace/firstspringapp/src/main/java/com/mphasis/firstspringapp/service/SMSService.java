package com.mphasis.firstspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSService {
	@Autowired
	private ProviderService providerService;
	public void sendSMS() {
		providerService.configureProvider();
		System.out.println("SMS Sent..........");
	}
}
