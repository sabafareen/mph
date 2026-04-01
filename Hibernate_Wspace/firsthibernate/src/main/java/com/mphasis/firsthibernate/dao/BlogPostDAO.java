package com.mphasis.firsthibernate.dao;

import org.hibernate.Session;

import com.mphasis.firsthibernate.model.BlogPost;
import com.mphasis.firsthibernate.model.Comment;
import com.mphasis.firsthibernate.util.HibernateUtil;

public class BlogPostDAO {
	public boolean addBlog(BlogPost blogpost)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(blogpost);
		System.out.println(blogpost.getId()+ "Saved....");
		session.getTransaction().commit();
		session.close();
		return true;
	}
	public boolean addComment(String blogid,Comment comment)
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BlogPost blogpost = session.find(BlogPost.class, blogid);
		blogpost.getComments().add(comment);
		comment.setBlogpost(blogpost);
		session.persist(blogpost);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
