package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		        List<Emplyee3> emplo = new ArrayList();
		        emplo.add(new Emplyee3("sreenu", 25,30000));
		        emplo.add(new Emplyee3("Brahma", 30,25000));
		        emplo.add(new Emplyee3("Mahesh", 20,20000));
		        
		        Comparator<Emplyee3> ageComparator = Comparator.comparingInt(Emplyee3::getAge);
		       
		        Collections.sort(emplo, ageComparator);

		        for (Emplyee3 emplyee3 : emplo) {
		            System.out.println("Name: " + emplyee3.getName() + ", Age: " + emplyee3.getAge());
		        }
		    }
		

	}

