package com.corejavaexample;
import java.util.Enumeration;
import java.util.Vector;

public class VectorlistEX {

	public static void main(String[] args) {
		Vector v= new Vector();
		
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer j=(Integer)e.nextElement();
			if(j%2==0)
			System.out.println(j);
		}
		
	}
	

}
