package com.java8Example;

import java.util.Collections;
import java.util.TreeSet;

public class TreesetForComparator {

	public static void main(String[] args) {
       
		TreeSet<Integer> ts=new TreeSet<>((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0);
		ts.add(57);
		ts.add(81);
		ts.add(5);
		ts.add(19);
		System.out.println(ts);
		

	}

}
