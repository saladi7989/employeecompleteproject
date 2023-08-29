package com.exceptions;

import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyBlockExample {

	public static void main(String[] args) throws Exception {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as sydba", "sinu7670");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				System.out.println("Final block always excuted");
			}
	}
}

	


