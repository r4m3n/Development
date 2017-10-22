package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTransaction {
	
	public static Connection connection=null;
	
	
	public static Connection getConnection(){
		closeConnection();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "passw0rd");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(){
		try {
			if(connection!=null)
				connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
