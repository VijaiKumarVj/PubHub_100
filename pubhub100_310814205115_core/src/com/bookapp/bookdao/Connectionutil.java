package com.bookapp.bookdao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionutil {

	public static Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbcDriver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/?User=root/userdb", "root", "Vijai@123");
		return connection;
	}
}
