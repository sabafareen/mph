package com.mphasis.firsthibernate;

import org.hibernate.Session;

import com.mphasis.firsthibernate.dao.BlogPostDAO;
import com.mphasis.firsthibernate.model.BlogPost;
import com.mphasis.firsthibernate.model.Comment;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class AppBlogComment {
	public static void main(String[] args) {
		//save();
		testblog();
	}
	private static void save() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BlogPost blog = new BlogPost("B1","Spring AI",
				"Spring AI is application framework."
				+"It simplifies the integration of artificial "
				+ " Java applications.", "Josh Long");
		Comment c1 = new Comment("C1","Nice!!","Sham");
		Comment c2 = new Comment("C2","Nice!!","Fia");
		
		c1.setBlogpost(blog);
		c2.setBlogpost(blog);
		blog.getComments().add(c1);
		blog.getComments().add(c2);
		
		session.persist(blog);
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved....");
	}
	
	private static void testblog() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BlogPostDAO blogpostDAO = new BlogPostDAO();
		BlogPost blog = new BlogPost("B2","Spring with k8","Spring with k8","Spring with k8");
		blogpostDAO.addBlog(blog);
		
		Comment comment = new Comment("C3","Nice!!","pia");
		blogpostDAO.addComment("B2", comment);
	}
}
