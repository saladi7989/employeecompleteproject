package com.corejavaexample;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		String name=null;
//		String name="sreenu";
		
		
		String msg=verifyname(name);
		System.out.println(msg);
		System.out.println("i am at line no 12");
		System.out.println("i am example exception");
		
		

	}
	
	public static String verifyname(String name) {
		
		String msg=null;
		try {
		if(name.equals("sreenu")) {
			msg="valid user";
		}
		} catch(Exception ex) {
			msg=ex.toString();
		}
		return msg;
	}

}
