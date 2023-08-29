package com.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArrayReverse {

	public static void main(String[] args) {
		
		String[] name={"sreenu","mahesh","srinu","brahma"};
		
     
//		for(int i=name.length-1;i>=0;i--) {
//			
//			System.out.println(name[i]);
			
			 List<String> list = Arrays.asList(name);
		        Collections.reverse(list);
	
		        String[] reversedArray = list.toArray(name);
		      
		        System.out.print("ReverseArray :"+Arrays.toString(reversedArray));
		       
		}
		

	}


