package com.java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeFunction {

	public static void main(String[] args) {
		
		List<Employee1> li =new ArrayList<Employee1>();
		
		Employee1 emp =new Employee1();
		emp.setName("sreenu");
		emp.setSalary(50000);
		
		
		Employee1 emp1 =new Employee1();
		emp1.setName("sreenu b");
		emp1.setSalary(40000);
		
		Employee1 emp2 =new Employee1();
		emp2.setName("sreenu m");
		emp2.setSalary(30000);
		
		Employee1 emp3 =new Employee1();
		emp3.setName("brahma");
		emp3.setSalary(60000);
		
		Employee1 emp4 =new Employee1();
		emp4.setName("bhanu");
		emp4.setSalary(20000);
		
		li.add(emp);
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		li.add(emp4);
		
		for(Employee1 em:li) {
			if(em.getSalary()>=50000) {
				System.out.println(em.getName());
				System.out.println(em.getSalary());
			}
		}
		
		//java8
		System.out.println("java8========================");
		
		Predicate<Employee1> p=e->e.getSalary()>=50000;
		List<Employee1>em2=li.stream().filter(p).collect(Collectors.toList());
		for(Employee1 e:em2) {
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			
		}
		
		

	}

}
