package com.corejavaexample;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		 
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(60);
		hs.add(30);

		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Integer va=(Integer)it.next();
			System.out.println(va);
		}
	}
	

}
