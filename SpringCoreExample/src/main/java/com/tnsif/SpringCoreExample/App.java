package com.tnsif.SpringCoreExample;

import org.springframework.context. ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		ApplicationContext var= new ClassPathXmlApplicationContext("springconfigure.xml");
		
		Student s1=var.getBean("student1", Student.class);
		System.out.println(s1);
		
		Student s2=var.getBean("student2", Student.class);
		System.out.println(s2);
		
		Student s3=var.getBean("student3", Student.class);
		System.out.println(s3);
	}
}
