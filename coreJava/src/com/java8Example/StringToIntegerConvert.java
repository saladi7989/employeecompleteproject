package com.java8Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToIntegerConvert {

	public static void main(String[] args) {
		
		 List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
		 
	        List<Integer> integerList = convertToIntegerList(stringList);

	        List<Integer> evenNumbers = findEvenNumbers(integerList);
	        
	        System.out.println("Even numbers: " + evenNumbers);
	    }

	    public static List<Integer> convertToIntegerList(List<String> stringList) {
	        List<Integer> integerList = new ArrayList<>();
	        
	        for (String str : stringList) {
	            int num = Integer.parseInt(str);
	            integerList.add(num);
	        }
	        
	        return integerList;
	    }

	    public static List<Integer> findEvenNumbers(List<Integer> integerList) {
	        List<Integer> evenNumbers = new ArrayList<>();
	        
	        for (int num : integerList) {
	            if (num % 2 == 0) {
	                evenNumbers.add(num);
	            }
	        }
	        
	        return evenNumbers;
	    }
	

	}


