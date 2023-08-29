package com.java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExam {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		
		li.add(7);
		li.add(5);
		li.add(4);
		li.add(3);
		li.add(8);
		
		System.out.println(li);
		System.out.println("=============");
		List<Integer> l=li.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l);
		
		long cou=li.stream().count();
		System.out.println(cou);
		
		
		List newlist=li.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(newlist);
		
		int val=l.stream().min((i1,i2)->i1.compareTo(i2)).get();System.out.println(val);
         
		int value=l.stream().max((i1,i2)->i1.compareTo(i2)).get();System.out.println(value);
		
		li.stream().forEach(s->System.out.print(s));
		System.out.println("=================");
		
		Stream<Integer> st=Stream.of(2,5,7,6,8);
		
		System.out.println(st);
	}

}
