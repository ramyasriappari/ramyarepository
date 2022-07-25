package com.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static Connection getConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String user="root";
		String pass="root";
	  Connection connection=DriverManager.getConnection(url,user,pass);
		return getConnect();
	}

}

