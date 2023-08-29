package com.corejavaexample;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Treesetexm2 {

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
		
		
		HashMap hm = new HashMap();
		 
		hm.put(1, emp);
		hm.put(2, emp1);
		hm.put(3, emp2);
		hm.put(4, emp3);
		
		Set keyset = hm.keySet();
		Iterator val=keyset.iterator();
		while(val.hasNext()) {
			Integer value=(Integer)val.next();
			Emplyee2 responce=(Emplyee2)hm.get(value);
			if(responce.getEmpname().equals("sreenu")||responce.getEmpname().equals("bramha")) {
				System.out.println(responce.getEmpid());
				System.out.println(responce.getEmpname());
				System.out.println(responce.getEmpsal());
			}
		
		
		
		
		

	}

	
	}

}
