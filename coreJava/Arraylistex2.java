package com.corejavaexample;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Arraylistex2 {

	public static void main(String[] args) {
		
        Emplyee2 emp=new Emplyee2();
		emp.setEmpid(101);
		emp.setEmpname("sreenu");
		emp.setEmpsal(12000);
		
		Emplyee2 emp1=new Emplyee2();
		emp1.setEmpid(1011);
		emp1.setEmpname("sree");
		emp1.setEmpsal(15000);
		
		Emplyee2 emp2=new Emplyee2();
		emp2.setEmpid(1012);
		emp2.setEmpname("bramha");
		emp2.setEmpsal(16000);
		
		Emplyee2 emp3=new Emplyee2();
		emp3.setEmpid(1013);
		emp3.setEmpname("mahesh");
		emp3.setEmpsal(18000);
		
		List<Emplyee2> arl=new ArrayList<Emplyee2>();
		
		arl.add(emp);
		arl.add(emp1);
		arl.add(emp3);
		arl.add(emp2);
		
		Iterator<Emplyee2> it = arl.iterator();
		while(it.hasNext()) {
			Emplyee2 responce=it.next();
			if(responce.getEmpname().equals("sreenu")||responce.getEmpname().equals("mahesh")) {
				System.out.println(responce.getEmpid());
				System.out.println(responce.getEmpname());
				System.out.println(responce.getEmpsal());
			}
		}	
	}
}
