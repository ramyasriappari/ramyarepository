package databasetesting.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertInPrepareStatement {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
        PreparedStatement ps=connection.prepareStatement("insert into bank values(?,?,?,?)");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter acc holder name");
        ps.setString(1, sc.next());
        System.out.println("enter Acc no");
        ps.setInt(2, sc.nextInt());
        System.out.println("enter ifsc code");
        ps.setString(3,sc.next());
        System.out.println("enter branch");
        ps.setString(4,sc.next());
        int x=ps.executeUpdate();
        if(x!=0) {
        	System.out.println("reacord inserted");
        }
        else {
        	System.out.println("invalid input");
        }
	}
}
