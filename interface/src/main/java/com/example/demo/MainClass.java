package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			
			ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
		    student Student =(student) context.getBean("demo");
		    System.out.println(Student.getCo().getA()+" "+Student.getLe().getA());
		    System.out.print(Student.getCo().getB()+" "+Student.getLe().getB());
     
	}

}
