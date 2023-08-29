package com.Array;

public class StringReverseEachString {

	public static void main(String[] args) {
		
		String[] str= {"sreenu","mahesh","mekala","brahma"};
		String[] words = str;
		for (String w:words) {
			 StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();
		        System.out.println(sb);
		}
		
	}

}
