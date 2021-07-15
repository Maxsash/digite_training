package com.digite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcFactory {
	private JdbcFactory() {
		
	}
	
	public static Connection getConnection() throws SQLException{
	
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, "yash", "oracle");
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new SQLException();
		}
	}

}
