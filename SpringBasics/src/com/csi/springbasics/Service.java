package com.csi.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e1 = (Employee) context.getBean("emp");
		e1.setEmpId(131);
		e1.setEmpName("Shubham");
		System.out.println(e1.getEmpId() + e1.getEmpName());

		Employee e2 = (Employee) context.getBean("emp");
		System.out.println(e2.getEmpId() + e2.getEmpName());
	}
}
