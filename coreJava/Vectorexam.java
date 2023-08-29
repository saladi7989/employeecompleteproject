package com.corejavaexample;
import java.util.Vector;

public class Vectorexam {

	public static void main(String[] args) {
		Vectorexam vee=new Vectorexam();
		Vector vr = new Vector();
		vr.add("srinu");
		vr.add("bala");
		vr.add("venky");
		vr.add("bramha");
		vr.add("mahesh");
		vr.add("dinesh");
		vr.add("ravi");
		vr.add("samba");
		boolean istrue=vee.verifyUsername(vr);
		if(istrue) {
			System.out.println("true");
		}else
		{
			System.out.println("false");
		}
		

	}
     boolean verifyUsername(Vector ve) 
     {
    	 String sv= new String("srinu");
    	 boolean istrue=false;
    	 for (int i=0;i<ve.size();i++) 
    	 {
    		 String st=(String)ve.get(i);
    		 if(st.equals(sv))
    		 {
    			 istrue=true;
    		 }
    		 
    	 }
    	 return istrue;
     }
}
