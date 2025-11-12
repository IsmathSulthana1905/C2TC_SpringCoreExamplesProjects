package com.tns.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student ismath=con.getBean("ismath",Student.class);
		Student harini=con.getBean("harini",Student.class);
		
		ismath.showInfo();
		harini.showInfo();
		
		//Constructor injection
		Student1 md=con.getBean("madhu",Student1.class);
		Student1 hm=con.getBean("hema",Student1.class);
		
		md.showInfo();
		hm.showInfo();
		
	}
}