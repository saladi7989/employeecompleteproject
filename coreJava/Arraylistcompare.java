package com.corejavaexample;
import java.util.ArrayList;
import java.util.Iterator;


public class Arraylistcompare {

	public static void main(String[] args) {
		Arraylistcompare ac=new Arraylistcompare();
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("india");
		arr.add("pakistan");
		arr.add("eng");
		arr.add("aus");
	
		String cn=ac.verifyContryname(arr);
		if(cn.equals("india"))
		{
			System.out.println("i am at india");
		}else
			
		{
			System.out.println("i am not in india");
		}
	}
    public String verifyContryname(ArrayList<String> ae) 
     {
    	 String cn = null ;
    	Iterator<String> it = ae.iterator();
    	while(it.hasNext()) {
    		String value=it.next();
    		cn=value;
    		break;
    	}	 
		return cn;
     }
	}


