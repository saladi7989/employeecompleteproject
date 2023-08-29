package com.java8Example;

import java.util.function.Function;
import java.util.function.Predicate;

public class Functionexample {

	public static void main(String[] args) {
		
		Function<String, Integer> f=i->i.length();
		int len=f.apply("srinivasarao saladi");
		System.out.println(len);
		
		Predicate<Integer> p=i->i%2==0;
		for(int i=1;i<100;i++) {
			if(p.test(i)) {
				System.out.println(i);
				
				
			}
		}
       Function<Integer, Integer> squ=s->s*s;
       System.out.println(squ.apply(6));
	}

}
