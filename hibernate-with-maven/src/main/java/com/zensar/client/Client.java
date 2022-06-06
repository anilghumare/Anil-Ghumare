package com.zensar.client;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.zensar.entity.Department;
import com.zensar.entity.Student;

public class Client {

	public static void main(String[] args) {
		
		Student student=new Student(123,"Pavan",28,new Date(),new Department(1, "IT"));

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();

		session.save(student);
		
		

		transaction.commit();

		session.close();

		factory.close();

	}

}
