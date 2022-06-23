package com.zensar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.beans.Student;
import com.zensar.config.JavaConfiguration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		//ApplicationContext context=new FileSystemXmlApplicationContext("D:\\context.xml");

		// Product p2=(Product)context.getBean("p2");

		// Product product = context.getBean(Product.class, "p2");
		
		//Resource resource = new FileSystemResource("context.xml");

		//BeanFactory factory = new XmlBeanFactory(resource);

		//Student student = (Student) factory.getBean("s1");
		//System.out.println(student);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Student student1 = context.getBean("stud", Student.class);
		
		
		
		
		//System.out.println(student1.hashCode());
		
	
		
		
		
		System.out.println(student1);
		
		//Student student2 = context.getBean("s1", Student.class);
		
		//Student student2 = context.getBean("s2", Student.class);

		//System.out.println(student1==student2);
		
		//System.out.println(student2);
		// System.out.println(p2);
		
		//((AbstractApplicationContext) context).close();

	}
}
