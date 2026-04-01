package com.mphasis.firstspringapp.service;

public class EmployeeService {
	private String name;
    private String position;
    private DepartmentService department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public DepartmentService getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentService department) {
		this.department = department;
	}
    
    
}
