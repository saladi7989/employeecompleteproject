package com.collections;

import java.util.ArrayList;

public class ValueInArralist {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al);
		
		if(al.contains(3))
		{
			System.out.println("1 exist in arraylist");
		}
			else
			{
				System.out.println("1 does not exist in arraylist");
			}

	}

}
