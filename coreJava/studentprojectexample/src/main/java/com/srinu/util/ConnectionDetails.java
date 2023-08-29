package com.srinu.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDetails {
	
	private Connection conn;

	public Connection getDBConnectionDetails() {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate", "postgres", "sinu7670");
		
		return conn;
		}catch(Exception ex) {
			return null;
		}
		
	}
	

}
