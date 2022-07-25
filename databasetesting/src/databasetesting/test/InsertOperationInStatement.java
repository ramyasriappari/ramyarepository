package databasetesting.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertOperationInStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		String Query="insert into bank values('murthy',123456,'A123D4','ponnamanda')";
		try {
		Connection connection= DriverManager.getConnection(url, username, password);
	   Statement st= connection.createStatement();
	   int x=st.executeUpdate(Query);
	   if(x>0)
	   {
		   System.out.println("record inserted");
	   }
	   else
	   {
		   System.out.println("invalid input");
	   }
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
