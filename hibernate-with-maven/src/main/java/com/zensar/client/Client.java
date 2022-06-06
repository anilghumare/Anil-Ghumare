package com.zensar.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entity.Address;
import com.zensar.entity.Student;

public class Client {

	public static void main(String[] args) {

		Student student = new Student(123, "Ram", 30, new Date());

		Address address1 = new Address(10, "Maha", "Pune", 411016);
		Address address2 = new Address(20, "MP", "Indore", 111222);
		Address address3 = new Address(30, "UP", "Kanpur", 222222);
		
		address1.setStudent(student);
		address2.setStudent(student);
		address3.setStudent(student);

		List<Address> address = new ArrayList<Address>();
		address.add(address1);
		address.add(address2);
		address.add(address3);

		student.setAddress(address);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		//session.save(address1);
		//session.save(address2);
		//session.save(address3);
		//session.save(student);
		session.save(address1);
		session.save(address2);
		session.save(address3);
		session.save(student);
		
		//Student student=(Student)session.get(Student.class, 123);
		
		//session.delete(student);

		transaction.commit();

		session.close();

		factory.close();

	}

}
