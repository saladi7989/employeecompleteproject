package com.corejavaexample;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class StuColeagedetailsEx extends StudentEx2 {

	public static void main(String[] args) {
		
		StudentEx2 stu=new StudentEx2();
		CollegeEx2 col=new CollegeEx2();
		
		col.setColid(101);
		col.setColname("sps");
		col.setColadd("darsi");
		stu.setStuid(11);
		stu.setStuname("sreenu");
		stu.setStubranch("bsc");
		
		StudentEx2 stu1=new StudentEx2();
		CollegeEx2 col1=new CollegeEx2();
		
		col1.setColid(102);
		col1.setColname("skr");
		col1.setColadd("darsi");
		stu1.setStuid(12);
		stu1.setStuname("bramha");
		stu1.setStubranch("msc");
		
		StudentEx2 stu2=new StudentEx2();
		CollegeEx2 col2=new CollegeEx2();
		
		col2.setColid(103);
		col2.setColname("srs");
		col2.setColadd("darsi");
		stu2.setStuid(13);
		stu2.setStuname("mahesh");
		stu2.setStubranch("bipc");
		
		StudentEx2 stu3=new StudentEx2();
		CollegeEx2 col3=new CollegeEx2();
		
		col3.setColid(101);
		col3.setColname("svs");
		col3.setColadd("darsi");
		stu3.setStuid(14);
		stu3.setStuname("bala");
		stu3.setStubranch("mpc");
		
		
		List al=new ArrayList();
		
		al.add(stu);
		al.add(stu1);
		al.add(stu2);
		al.add(stu3);
		al.add(col);
		al.add(col1);
		al.add(col2);
		al.add(col3);
		
		StuColeagedetailsEx sc=new StuColeagedetailsEx();
		sc.savecoldetails(al);
		System.out.println("after call save coldetails");
		
     
		
		HashSet st= new HashSet();
		
		st.add(col);
		st.add(col1);
		st.add(col2);
		st.add(col3);
		
		Iterator te= st.iterator();
		while(te.hasNext()) {
			String name =(String)te.next();
			if(name.equals("sps"));
	}
	}


	private void savecoldetails(List al) {
		try {
			
		
	
		    Iterator ti= al.iterator();
			while(ti.hasNext()) {
				Object response=ti.next();
				if(response instanceof CollegeEx2)
				{
				CollegeEx2 cl=(CollegeEx2) response;
				System.out.println(cl.getColname());
				}
			}
		
	}catch(Exception e) {
		String errorresponse=e.getMessage();
		System.out.println(errorresponse);
	}
}
}
		


