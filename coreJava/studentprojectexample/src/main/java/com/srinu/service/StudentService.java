package com.srinu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.srinu.pojo.Student;
import com.srinu.util.ConnectionDetails;

@Service
public class StudentService {

	public  void saveStudent(Student student) {
		
		String query="INSERT INTO student(name,sid,address,mobilenumber,email,country,gender)VALUES(?,?,?,?,?,?,?)";
		 
		ConnectionDetails dbcon=new ConnectionDetails();
		Connection con=dbcon.getDBConnectionDetails();
		try {
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, student.getName());
			pst.setInt(2, student.getSid());
			pst.setString(3, student.getAddress());
			pst.setInt(4, student.getMobilenumber());
			pst.setString(5, student.getEmail());
			pst.setString(6, student.getCountry());
			pst.setString(7, student.getGender());
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
