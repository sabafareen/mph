package com.mphasis.firsthibernate;

import org.hibernate.Session;

import com.mphasis.firsthibernate.model.Address;
import com.mphasis.firsthibernate.model.User;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class AppUser {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Address address = new Address("Kharadi bypass" ,"Pune","411037");
		User user = new User("U1" ,"Jerry",address);
		session.persist(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("saved....");
	}
}
