package com.mphasis.firsthibernate;


import org.hibernate.Session;

import com.mphasis.firsthibernate.model.Customer;
import com.mphasis.firsthibernate.model.Locker;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class AppCustomerLocker {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Locker locker = new Locker("L1","Rack_A","Big");
		session.persist(locker);
		
		Customer customer = new Customer("C1","Shrek");
		customer.setLocker(locker);
		session.persist(customer);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("saved....");
	}
}
