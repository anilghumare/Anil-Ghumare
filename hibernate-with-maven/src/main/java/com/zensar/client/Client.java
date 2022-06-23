package com.zensar.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entity.Student;

public class Client {

	public static void main(String[] args) {

		Student student = new Student(3, "Laxman", 26, new Date());
		
		
       
		

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		
		
		
		//session.persist(student);
		
		//Student student=(Student)session.get(Student.class, 123);
		
		//session.delete(student);

		
		
		
		
		
		transaction.commit();
		
		//Serializable serializable = session.save(student);
		//System.out.println(serializable);
		
		
		session.persist(student);

		session.close();
		
		
		
		

		factory.close();

	}

}
