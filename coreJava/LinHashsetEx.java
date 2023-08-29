package com.corejavaexample;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinHashsetEx {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		 
		lhs.add(10);
		lhs.add(20);
		lhs.add(40);
		lhs.add(10);
		lhs.add(30);
		lhs.add(40);
		
		Iterator it=lhs.iterator();
		while(it.hasNext()) {
			Integer lhe=(Integer)it.next();
			System.out.println(lhe);
		}
	}

}
