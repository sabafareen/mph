package com.mphasis.firsthibernate;

import org.hibernate.Session;

import com.mphasis.firsthibernate.model.CreditAccount;
import com.mphasis.firsthibernate.model.DebitAccount;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class AppAccount {
public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	session.beginTransaction();
	
	CreditAccount ca = new CreditAccount();
	ca.setId("C1");
	ca.setCreditLimit(100000);
	ca.setBalance(500000);
	session.persist(ca);
	
	DebitAccount da = new DebitAccount();
	da.setId("D1");
	da.setOverdraftfee(1000);
	da.setBalance(600000);
	session.persist(da);
	
	session.getTransaction().commit();
	session.close();
}
	
}
