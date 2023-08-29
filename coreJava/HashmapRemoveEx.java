package com.corejavaexample;
import java.util.HashMap;

public class HashmapRemoveEx {

	public static void main(String[] args) {
		  HashMap<Integer, String> map=new HashMap<Integer, String>(); 
		  
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav"); 
	      
	    System.out.println("Initial list : "+map);  
	   
	    map.remove(100);
	    
	    System.out.println("Updated list : "+map);
	    
	    map.replace(103, "sreenu"); 
	    
	    System.out.println("Updated list : "+map);
	    
	    map.remove(102, "Rahul"); 
	    
	    System.out.println("Updated list : "+map);  
	   }      
	

	}


