package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			System.out.println("Creating a table");
			String query="CREATE TABLE names(regdno INT NOT NULL, name VARCHAR(45) NOT NULL, branch VARCHAR(30) NOT NULL, section VARCHAR(45) NOT NULL)";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Table employee Created\n");
			String query1 = "INSERT INTO names " + "VALUES (100, 'kavya', 'IT', 'A')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO names " + "VALUES (101, 'suman', 'CSE', 'A')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO names " + "VALUES (102, 'sony', 'IT', 'B')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO names " + "VALUES (103, 'mehra', 'EEE', 'A')";
			stmt.executeUpdate(query1);
			
			System.out.println("Values inserted into table successfully");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM names");
	         System.out.println("\nREGDNO\tNAME\tBRANCH\tSECTION");
	         
	         while (rs.next()) {
	            int regdno = rs.getInt("regdno");
	            String name = rs.getString("name");
	            String branch = rs.getString("branch");
	            String section = rs.getString("section");
	            System.out.println(regdno + "\t" + name + "\t" + branch + "\t" + section);
	         }
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}