package com.corejavaexample;

public class ExcepEx2 {

	public static void main(String[] args) {
		
	String name=null;
		//String name="sreenu";
		int a[]= {1,2,3,4,5,6};
		
		
		String msg=verifyname(name, a);
		System.out.println(msg);
		System.out.println("i am at line no 12");
		System.out.println("i am example exception");
		
		

	}
	
	public static String verifyname(String name, int[] a) {
		
		String msg=null;
		try {
		if(name.equals("sreenu")) {
			msg="valid user";
		}
		System.out.println(a[12]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.getMessage();
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException ex) {
			ex.getMessage();
			System.out.println("ArithmeticException");
		}
		catch(NullPointerException ex) {
			msg=ex.getMessage();
			System.out.println("NullPointerException");
		}
		 catch(Exception ex) {
			msg="ExcepEx2:"+"verifyname:"+ex.getLocalizedMessage();
		}finally{
			System.out.println("i am at finally block");
		}
		return msg;
	}

	}


