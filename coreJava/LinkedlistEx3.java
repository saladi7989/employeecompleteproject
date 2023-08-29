package com.corejavaexample;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistEx3 {

	public static void main(String[] args) {
	    List l=new LinkedList();
	    
	    l.add(10);
	    l.add("sree");
	    l.add(30);
	    l.set(0, "srinu");
	    l.add(null);
	    l.set(1, "sreenu");
	    l.add(20);
	    l.add(1, 25);
	    System.out.println(l);

	}

}
