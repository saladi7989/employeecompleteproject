package com.springpractise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext reference = new AnnotationConfigApplicationContext(EmployeeConfi.class);

		Employee emp=reference.getBean(Employee.class);
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		
		//Employee emp1=reference.getBean("employee2",Employee.class);
		//System.out.println(emp1.getEid());
		//System.out.println(emp1.getEname());

		Employee emp3=reference.getBean("salesEmployee",Employee.class);
		System.out.println(emp3.getEid());
		System.out.println(emp3.getEname());

	}

}
