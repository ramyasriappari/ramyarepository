package com.employeemanager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;public class DbConnection {
public static Connection getconnect() throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/motivity";
String user="root";
String pass="root";
Connection connect=DriverManager.getConnection(url,user,pass);
return connect;
}}


