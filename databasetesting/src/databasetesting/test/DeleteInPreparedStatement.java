package databasetesting.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DeleteInPreparedStatement {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
        PreparedStatement ps=connection.prepareStatement("delete from bank where AccoHolderName=?");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter acc holder name");
        ps.setString(1, sc.next());
        int x=ps.executeUpdate();
        if(x!=0) {
        	System.out.println("reacord inserted");
        }
        else {
        	System.out.println("invalid input");
	}

}
}