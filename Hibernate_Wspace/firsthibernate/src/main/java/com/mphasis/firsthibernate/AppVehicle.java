package com.mphasis.firsthibernate;
import org.hibernate.Session;

import com.mphasis.firsthibernate.model.TwoWheeler;
import com.mphasis.firsthibernate.util.HibernateUtil;
import com.mphasis.firsthibernate.model.FourWheeler;


public class AppVehicle {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		TwoWheeler tw = new TwoWheeler();
		tw.setId("V1");
		tw.setManufacturer("Honda");
		tw.setSteeringHandleType("T-Bar");
		session.persist(tw);
		
		FourWheeler fw1 = new FourWheeler();
		fw1.setId("V2");
		fw1.setManufacturer("Audi");
		fw1.setSteeringHandleType("Power");
		session.persist(fw1);
		
		FourWheeler fw2 = new FourWheeler();
		fw2.setId("V3");
		fw2.setManufacturer("Audi");
		fw2.setSteeringHandleType("E-Power");
		session.persist(fw2);
		
		session.getTransaction().commit();
		session.close();
	}

}
