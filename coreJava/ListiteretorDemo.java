package com.corejavaexample;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListiteretorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("sreenu");
		l.add("sri");
		l.add("bramha");
		l.add("mahi");
		
		System.out.println(l);
		
		ListIterator itr=l.listIterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			if(s.equals("sri")) {
				itr.remove();	
			}
			if(s.equals("bramha")) {
				itr.set("bramha raju");
			}
			if(s.equals("mahi")) {
				itr.add("mahesh");
			}
		}

}
}
