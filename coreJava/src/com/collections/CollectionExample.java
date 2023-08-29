package com.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.comparator.Mycomparator;

public class CollectionExample {

	public static void main(String[] args) {

		ArrayList <Integer> al=new ArrayList<>();
		al.add(7);
		al.add(99);
		al.add(51);
		al.add(0);
		al.add(23);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,new Mycomparator());
		
		System.out.println(al);

	}

}
