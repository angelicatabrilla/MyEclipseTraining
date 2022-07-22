package training.talentpool.javafundamentals101;
import java.sql.*;				//import java.sqlclass

public class SQLCon {
	public static void main (String[]args) {
		try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/", "root", "Artabrilla9699");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM batch3.interns");
			
			while (rs.next()) {
				System.out.println("hello "+rs.getString("firstname") + " " +rs.getString("lastname"));
			}
			con.close();
		}	catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();
		}
	}
}
