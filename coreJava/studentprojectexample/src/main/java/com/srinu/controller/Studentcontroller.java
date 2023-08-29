package com.srinu.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srinu.pojo.Student;
import com.srinu.service.StudentService;

@Controller
public class Studentcontroller {
	
	@Autowired
	StudentService studentservice;
	
	@RequestMapping(value="/studentform",method=RequestMethod.GET)
	public ModelAndView loadstudentform() {
		
		ModelAndView mv=new ModelAndView("student");
		return mv;	
	}
	   @RequestMapping(value="/saveStudentData",method=RequestMethod.POST)
      public void saveStudentDetails(HttpServletRequest request) {
    	  
		   Student st=new Student();
		   
		   String name=request.getParameter("name");
		   String sid=request.getParameter("sid");
		   String Adress=request.getParameter("address");
		   String Mnumber=request.getParameter("mobilenumber");
		   String Email=request.getParameter("email");
		   String country=request.getParameter("country");
		   String gender=request.getParameter("gender");
		   
		   st.setName(name);
		   int id=Integer.parseInt(sid);
		   st.setSid(id);
		   st.setAddress(Adress);
		   int mnum=Integer.parseInt(Mnumber);
		   st.setMobilenumber(mnum);
		   st.setEmail(Email);
		   st.setCountry(country);
		   st.setGender(gender);
		   studentservice.saveStudent(st);
		   
      }
}
