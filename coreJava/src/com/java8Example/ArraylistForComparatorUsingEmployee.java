
package com.java8Example;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistForComparatorUsingEmployee {

	public static void main(String[] args) {
		
		ArrayList <Employee> al=new ArrayList<>();
		al.add(new Employee(105, "sreenu"));
		al.add(new Employee(459, "mahesh"));
		al.add(new Employee(7, "mekala"));
		al.add(new Employee(856, "brahma"));
		al.add(new Employee(25, "bhanu"));
		
		System.out.println(al);
		Collections.sort(al,(i1,i2)->(i1.getRollNo()<i2.getRollNo())?+1:(i1.getRollNo()>i2.getRollNo())?-1:0);
		
		System.out.println(al);

	}

}
