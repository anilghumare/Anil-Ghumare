package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
    	
    	Product p=(Product)context.getBean("product");
    	
    	System.out.println(p);
    	
    	
    	
    	
    }
}
