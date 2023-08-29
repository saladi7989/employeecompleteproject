package com.corejavaexample;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class JdbcDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","Sinu7670");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			
			while(rs.next()) {
				int id=rs.getInt(0);
				String name=rs.getString(1);
				String address=rs.getString(2);
				System.out.println("id="+id+",name="+name+",address="+address);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
