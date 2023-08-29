package com.java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMaxValues {

	public static void main(String[] args) {
		
		 List<Integer> values = Arrays.asList(53, 25, 10, 18, -7, 36,-9,0);
	        
	        int val=values.stream().min((i1,i2)->i1.compareTo(i2)).get();
	        System.out.println("Minimum value:"+val);
	         
			int value=values.stream().max((i1,i2)->i1.compareTo(i2)).get();
			System.out.println("Maximum value: " +value);
	}


	}


