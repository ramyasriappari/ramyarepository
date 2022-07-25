package databasetesting.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DeleteOperationInStatement1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		String Query="delete from bank where AccoHolderName='murthy'";
		try {
		Connection connection= DriverManager.getConnection(url, username, password);
	   Statement st= connection.createStatement();
	   int x=st.executeUpdate(Query);
	   if(x>0)
	   {
		   System.out.println("record deleted");
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
