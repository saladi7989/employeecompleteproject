package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCountinString {

	public static void main(String[] args) {
		
		String str= "bramaiah";
	
		 Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		 
	        char[] charArray = str.toCharArray();
	        
	        for (Character ch : charArray) {
	        	
	            if (map.containsKey(ch)) {
	            	
	            	map.put(ch, map.get(ch) + 1);  
	            }
	            else{  
	            	map.put(ch, 1);  
	            } 
	        }  
	        Set<Character> keys = map.keySet();  
	        for (Character ch : keys) {  
	            if (map.get(ch) > 0) {  
	                System.out.println(ch + "=" + map.get(ch));  
	            }
	        }
	     }
	}
	        
	     

