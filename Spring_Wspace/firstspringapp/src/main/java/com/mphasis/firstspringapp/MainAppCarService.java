package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.CarService;
import com.mphasis.firstspringapp.service.EngineService;
import com.mphasis.firstspringapp.service.StudentService;

public class MainAppCarService {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		CarService carService = container.getBean("carService",CarService.class);
		carService.car();
		
		//EngineService engineService = container.getBean("engineService",EngineService.class);
		//engineService.engine();
		
		container.close();
		container.registerShutdownHook();
	}
}
