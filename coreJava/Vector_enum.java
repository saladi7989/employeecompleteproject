package com.corejavaexample;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_enum {

	public static void main(String[] args) {
		Vector_enum ve=new Vector_enum();
		Vector vrr = new Vector();
		vrr.add("srinu");
		vrr.add("bala");
		vrr.add("venky");
		vrr.add("bramha");
		vrr.add("mahesh");
		vrr.add("dinesh");
		vrr.add("ravi");
		vrr.add("samba");
		boolean istrue=ve.verifyUsername(vrr);
		if(istrue) {
			System.out.println("true");
		}else
		{
			System.out.println("false");//
		}
	}

    boolean verifyUsername(Vector vee) 
     {
    	 String svv= new String("srinu1");
    	 boolean istrue=false;
    	Enumeration enu=vee.elements();
    	while(enu.hasMoreElements())	
    	 {
    		 String st=(String)enu.nextElement();
    		 if(st.equals(svv))
    		 {
    			 istrue=true;
    		 }
    		 
    	 }
    	 return istrue;
     }


	}


