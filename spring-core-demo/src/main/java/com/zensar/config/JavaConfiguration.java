package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zensar.beans.Student;

@Configuration
//@ComponentScan("com") // context:component-scan
//@PropertySource(value = { "data.properties" })
public class JavaConfiguration {

	@Bean(value = "stud")
	public Student student() {
		return new Student(1001, "Rani", 13);
	}

}
