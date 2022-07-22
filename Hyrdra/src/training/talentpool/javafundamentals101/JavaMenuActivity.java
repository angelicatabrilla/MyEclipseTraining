package training.talentpool.javafundamentals101;
import java.sql.*;
import java.util.Scanner;

public class JavaMenuActivity {
	public static void main (String[]args) {
		String domain = "jdbc:mysql://localhost:3306/batch3";
		String root = "root";
		String password = "Artabrilla9699";
	
	try {			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(domain, root, password);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		
		do {	
		System.out.println("\nHi " + name + "! \rHere are the Available Services");
		System.out.println(" 1 - View Enrolled Students\n 2 - Enrollment\n 3 - View Student Year Level");
		System.out.print("Choose a service: ");
		String service = input.nextLine();
		
		switch (service) {    
			case "1":
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
				break;
       
			case "2":
				String updateQuery = "INSERT INTO interns(firstname, lastname, yearSection) VALUES (?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(updateQuery);
					
				
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
				break;
       
			case "3":
				String studentyear = "{? = call InternLevel(?)}";
				CallableStatement cstmt =  con.prepareCall(studentyear); 
				
				
				System.out.print("\nCheck your year level");
				System.out.print("\nInsert Student Year(YYYY): ");
				String studentLevel = input.nextLine();
				
				cstmt.setInt(2, Integer.valueOf(studentLevel));
				cstmt.registerOutParameter(1, Types.VARCHAR);
				cstmt.execute();
				System.out.println("STUDENT LEVEL: " + cstmt.getString(1));
				break;	
		
			default:
				System.out.println("Hi " + name + "! The service you choose is not in the selection! Please try again!");
				break;
		}
		
		
		
		System.out.println("\nDo you want to view available services again?");
		System.out.println("Type YES to continue.");
		}
		while (input.nextLine().equalsIgnoreCase("YES"));
			input.close();
			con.close();		
	}
	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		
	}
}
}

