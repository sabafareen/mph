package com.mphasis.firsthibernate.dao;

import org.hibernate.Session;

import com.mphasis.firsthibernate.model.Department;
import com.mphasis.firsthibernate.model.Employee;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class EmployeeDAO {
	public boolean addEmployee(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	public boolean addDepartment(Department department) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(department);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	public boolean assign(String empid,String deptid) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Employee employee = session.find(Employee.class, empid);
		Department department = session.find(Department.class, deptid);
		employee.setDepartment(department);
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
		return true;
		
	}
}
