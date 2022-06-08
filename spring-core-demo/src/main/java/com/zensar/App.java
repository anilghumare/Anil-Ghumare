package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Address;
import com.zensar.beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		// Product p2=(Product)context.getBean("p2");

		// Product product = context.getBean(Product.class, "p2");

		Student student = context.getBean("s1", Student.class);

		System.out.println(student);
		// System.out.println(p2);

	}
}
