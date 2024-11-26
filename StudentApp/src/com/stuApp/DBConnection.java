package com.stuApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;

	public static Connection createDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/studentmanagementsystem";
			String username = "root";
			String password = "Lalitpur@123";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

