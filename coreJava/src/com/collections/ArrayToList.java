package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		String[]arr= {"sreenu","maahesh","mekala"};
		
		System.out.println("array:"+Arrays.toString(arr));
		
		List al=new ArrayList(Arrays.asList(arr));
		
		System.out.println("list:"+al);

	}

}
