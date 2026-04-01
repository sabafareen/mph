package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.StudentService;

public class MainAppStudentService {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		StudentService studentService = container.getBean("studentService",StudentService.class);
		studentService.student();
		
		container.close();
		container.registerShutdownHook();
	}
}
