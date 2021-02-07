package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			
			String query="update names set section=? where regdno=?";
			
			PreparedStatement upsmt=con.prepareStatement(query);
			
			upsmt.setString(1, "C");
			upsmt.setString(2, "106");
			
			
			int rows=upsmt.executeUpdate();
			System.out.println(rows+" row(s) are updated.");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from names");
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