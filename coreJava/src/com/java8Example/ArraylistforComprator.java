package com.java8Example;

import java.util.ArrayList;
import java.util.Collections;

import com.comparator.Mycomparator;

public class ArraylistforComprator {

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
		
		Collections.sort(al,(i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0);
		
		System.out.println(al);

	}

}
