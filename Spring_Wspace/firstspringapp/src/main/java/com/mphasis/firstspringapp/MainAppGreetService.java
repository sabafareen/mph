package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.EmailService;
import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.MailServerConfig;
import com.mphasis.firstspringapp.service.OrderService;

public class MainAppGreetService {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		GreetService greetService = container.getBean("greetService",GreetService.class);
		greetService.greet();
		
		MailServerConfig mailServerConfig = container.getBean("mailServerConfig",
				MailServerConfig.class);
		mailServerConfig.mail();
		
		

		container.close();
		container.registerShutdownHook();
	}
}
