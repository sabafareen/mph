package com.mphasis.firsthibernate;

import org.hibernate.Session;

import com.mphasis.firsthibernate.model.Course;
import com.mphasis.firsthibernate.model.Student;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class AppStudentCourse {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Student student1 = new Student("S1","Alice");
		Student student2 = new Student("S2","Bob");

		Course math = new Course("M1","Mathematics");
		Course science = new Course("S1","Science");

		// Associate (ALWAYS manage both sides to keep consistency)
		student1.getCourses().add(math);
		math.getStudents().add(student1);

		student1.getCourses().add(science);
		science.getStudents().add(student1);

		student2.getCourses().add(math);
		math.getStudents().add(student2);
		
		session.persist(science);
		session.persist(math);
		session.persist(student1);
		session.persist(student2);     
		
		session.getTransaction().commit();
		session.close();

	}
}
