package training.talentpool.javafundamentals101;
import java.sql.*;
import java.util.Scanner;

public class jdbcProgram {
	public static void main (String[]args) {
			String domain = "jdbc:mysql://localhost:3306/batch3";
			String root = "root";
			String password = "Artabrilla9699";
		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(domain, root, password);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM batch3.interns");
			
			System.out.println("----------------+----------------------------+--------------+");
			System.out.println("|  STUDENT ID   |      ENROLLED STUDENTS     |  YEAR LEVEL  |");
			System.out.println("+---------------+----------------------------+--------------+");
			
			while (rs.next()) {
				System.out.print(String.format("%10s",rs.getInt("id")));
				System.out.print(String.format("%30s",rs.getString("firstname") + " " +rs.getString("lastname")));
				System.out.println(String.format("%15s",rs.getInt("yearSection")));
			}
			
			String updateQuery = "INSERT INTO interns(firstname, lastname, yearSection) VALUES (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("\nDo you want to enrolled? (Y/N) ");
			String decision = input.nextLine();
				if (decision.equalsIgnoreCase("Y")) {
					System.out.println("\nHello, Welcome to Enrollment. Please state all the details been asked.");
					System.out.print("STUDENT LAST NAME: ");
					String lname = input.nextLine();
					System.out.print("STUDENT FIRST NAME: ");
					String fname = input.nextLine();
					System.out.print("STUDENT YEAR LEVEL: ");
					String year = input.nextLine();
					pstmt.setString(1, fname);
					pstmt.setString(2, lname);
					pstmt.setString(3, year);
					pstmt.executeUpdate();
					System.out.println("You are now officially enrolled!");
				}
				else {
					System.out.println("Thank you for using the program!");
					input.nextLine();
				}
			
						
			
				String studentyear = "{? = call InternLevel(?)}";
				CallableStatement cstmt =  con.prepareCall(studentyear); 
				
				
				System.out.print("\nCheck your year level");
				System.out.print("Insert Student Year(YYYY): ");
				String studentLevel = input.nextLine();
				
				cstmt.setInt(2, Integer.valueOf(studentLevel));
				cstmt.registerOutParameter(1, Types.VARCHAR);
				cstmt.execute();
				System.out.println("STUDENT LEVEL: " + cstmt.getString(1));
				
				
			con.close();
			input.close();
			
		}
		catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();
			
		}
	}
}
