package com.java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentFunctoin {

	public static void main(String[] args) {
		
		List<Student> stulist= new ArrayList<Student>();
		
		Student st=new Student();
		st.setMarks(90);
		st.setName("srinu");
		
		Student st1=new Student();
		st1.setMarks(70);
		st1.setName("srinu m");
		
		Student st2=new Student();
		st2.setMarks(60);
		st2.setName("srinu b");
		
		Student st3=new Student();
		st3.setMarks(85);
		st3.setName("mahesh");
		
		Student st4=new Student();
		st4.setMarks(50);
		st4.setName("braham");
		
		Student st5=new Student();
		st5.setMarks(30);
		st5.setName("bhanu");
		
		stulist.add(st);
		stulist.add(st1);
		stulist.add(st2);
		stulist.add(st3);
		stulist.add(st4);
		stulist.add(st5);
		
		List<String> list=grades(stulist);
		for(String val:list) {
			System.out.println(val);
		}
		//java8
		Function<Student, String> f=stdlist->{
			if(st.getMarks()>=80) {
				return "A grade"+"name="+st.getName();
			}
			else if(st.getMarks()>=70) {
				return "B grade"+"name="+st.getName();
			}
			else if(st.getMarks()>=60) {
				return "C grade"+"name="+st.getName();
			}
			else if(st.getMarks()>=50) {
				return "D grade"+"name="+st.getName();
			}
			else if(st.getMarks()>=40) {
				return"Fail"+"name="+st.getName();
			}else {
				return "Fail"+"name="+st.getName();
			}
			
			
		};
		String value=f.apply(st4);
		System.out.println(value);

	}
     //java7
	public static List<String> grades(List<Student> stulist) {
		List<String> list=new ArrayList<>();
		for(Student st:stulist) {
			if(st.getMarks()>=80) {
				list.add("A grade"+"name="+st.getName());
			}
			else if(st.getMarks()>=70) {
				list.add("B grade"+"name="+st.getName());
			}
			else if(st.getMarks()>=60) {
				list.add("C grade"+"name="+st.getName());
			}
			else if(st.getMarks()>=50) {
				list.add("D grade"+"name="+st.getName());
			}
			else if(st.getMarks()>=40) {
				list.add("Fail"+"name="+st.getName());
			}else {
				list.add("Fail"+"name="+st.getName());
			}
			
		}
		return list;
		
	}
	
	
}
