package com.collections;

import java.util.ArrayList;

public class ArraListtoArray {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("mahesh");
		al.add("srinu");
		al.add("deepu");
		al.add("ramu");
		
		System.out.println(al);
		
		String[] arr=new String[al.size()];
		al.toArray(arr);
		
		for(String x:arr)
		{
			System.out.print(x+" ");
		}

	}

}
