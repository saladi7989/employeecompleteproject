package com.corejavaexample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListiteExample {

	public static void main(String[] args) {
		String val=null;
		ArrayList ale= new ArrayList();
		ale.add("india");
		ale.add("pakistan");
		ale.add("eng");
		ale.add("aus");
		
		ListIterator li=ale.listIterator();
		while(li.hasNext()) {
			String name=(String)li.next();
			if(name.equals("eng")) {
			val=(String) li.previous();
			break;
		}
		}
		
         System.out.println(val);
	}

}
