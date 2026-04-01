package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.EmployeeService;

public class MainAppDeptEmply {
	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
 
		EmployeeService emp1 = container.getBean("employeeService1", EmployeeService.class);
		EmployeeService emp2 = container.getBean("employeeService2", EmployeeService.class);
 
		System.out.println("Employee 1:");
		System.out.println(emp1.getName() + " - " + emp1.getPosition() + " - " + emp1.getDepartment().getName());
 
		System.out.println("Employee 2:");
		System.out.println(emp2.getName() + " - " + emp2.getPosition() + " - " + emp2.getDepartment().getName());
 
		container.close();
	}
}
