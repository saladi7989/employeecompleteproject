package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		Employee em=new Employee();
		em.setEid(11);
		em.setName("sreenu");
		em.setSalary(20000);
		
		Employee em1=new Employee();
		em1.setEid(11);
		em1.setName("sreenu");
		em1.setSalary(20000);
		
		Employee em2=new Employee();
		em2.setEid(12);
		em2.setName("brahma");
		em2.setSalary(30000);
		
		Employee em4=new Employee();
		em4.setEid(13);
		em4.setName("bhanu");
		em4.setSalary(10000);
		
		hs.add(em);
		hs.add(em1);
		hs.add(em2);
		hs.add(em4);
		
		System.out.println(hs);
		

	}
}
