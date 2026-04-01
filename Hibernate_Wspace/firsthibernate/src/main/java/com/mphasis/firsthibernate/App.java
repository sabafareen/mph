package com.mphasis.firsthibernate;

import org.hibernate.Session;

import com.mphasis.firsthibernate.dao.ContactDAO;
import com.mphasis.firsthibernate.model.Contact;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		
		ContactDAO contactDAO = new ContactDAO();
		Contact c = new Contact("C1" , "Tia", "tia@gmail.com");
		if(contactDAO.save(c))
			System.out.println(c.getId() + " saved....");
	}

}
