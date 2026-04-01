package com.mphasis.firsthibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.SelectionQuery;

import com.mphasis.firsthibernate.model.Contact;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class L1CaheDemo {
	public static void main(String[] args) {
		//SingleSession();
		MultipleSession();
	}

	private static void SingleSession() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = session.find(Contact.class, "C1");
		System.out.println(c.getId() + "," + c.getName() + "," + c.getEmail());
		System.out.println("============================");
		 c = session.find(Contact.class, "C1");
		System.out.println(c.getId() + "," + c.getName() + "," + c.getEmail());
		session.getTransaction().commit();
		session.close();
	}
	//L2 Cache enabled
	private static void MultipleSession() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = session.find(Contact.class, "C1");
		System.out.println(c.getId() + "," + c.getName() + "," + c.getEmail());
		session.getTransaction().commit();
		session.close();
		System.out.println("============================");
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		c = session.find(Contact.class, "C2");
		System.out.println(c.getId() + "," + c.getName() + "," + c.getEmail());
		session.getTransaction().commit();
		session.close();
	}
}
