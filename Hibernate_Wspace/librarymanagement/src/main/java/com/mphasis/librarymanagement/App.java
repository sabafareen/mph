package com.mphasis.librarymanagement;

import org.hibernate.Session;

import com.mphasis.librarymanagement.model.Book;
import com.mphasis.librarymanagement.util.HibernateUtil;
public class App {
	


	    public static void main(String[] args) {
	    	save();
	    }
	    public static void save() {
	    	Session session =HibernateUtil.getSessionFactory().getCurrentSession();
	    	session.beginTransaction();
	    	Book b=new Book(1,"ABC","SAM","SAY21",2021);
	    	session.persist(b);
	    	session.getTransaction().commit();
	    	session.close();
	    	System.out.println("Saved.....");
	  	}
	}

