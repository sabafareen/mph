package com.mphasis.firsthibernate;

import org.hibernate.Session;

import com.mphasis.firsthibernate.dao.EmployeeDAO;
import com.mphasis.firsthibernate.model.Department;
import com.mphasis.firsthibernate.model.Employee;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class AppEmployeeDepartment {
	public static void main(String[] args) {
		EmployeeDAO edao = new EmployeeDAO();
		 
		//Employee e = new Employee("E1","John",645565);
		//edao.addEmployee(e); 
		//Department d = new Department("D1","sales");
		//edao.addDepartment(d);
		
		edao.assign("E1", "D1");
	}
}
