package com.exceptions;

public class FinallyBlockExample2 {

	public static void main(String[] args) {
		
		 try{    
			   int A=25/5;    
			   System.out.println(A);    
			  }    
			  
			  catch(NullPointerException e){  
			System.out.println(e);  
			}    
	 
			 finally {  
			System.out.println("finally block is always executed");  
			}    
			    
			System.out.println("rest of phe code...");    
			  }    

	}


