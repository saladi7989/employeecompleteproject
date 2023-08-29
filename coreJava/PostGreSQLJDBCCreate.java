package com.corejavaexample;
import java.sql.Connection;
import java.sql.DriverManager;

public class PostGreSQLJDBCCreate {

	public static void main(String[] args)   {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate", "postgres", "sinu7670");
			System.out.println("opened database successfully");			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
