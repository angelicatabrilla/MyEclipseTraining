package HydraUniversity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class EnrollmentSystem {
	
	 static void enroll (String enroll) {
		 ClassID id = new ClassID();
		 Menu sqlmenu = new Menu();
		 Scanner input = new Scanner(System.in);
		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Connection con = AccountConnectionDB.getInstance().getConnection();
				
				String updateQuery = "INSERT INTO interns(firstname, lastname, yearSection) VALUES (?,?,?)";
				Statement stmt = con.createStatement();
				PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(updateQuery, Statement.RETURN_GENERATED_KEYS);
			
				String fname = "";
				String lname = "";
				int year = 0;
				
				String sdecision = "";
				ResultSet rs = null;
				
				System.out.println("\nDo you want to enrolled? (Y/N) ");
				String decision = input.nextLine();
				if (decision.equalsIgnoreCase("Y")) {
					System.out.println("\nHello, Welcome to Enrollment. "
								+ "Please state all the details been asked.");
					System.out.print("STUDENT LAST NAME: ");
					lname = input.nextLine();
					System.out.print("STUDENT FIRST NAME: ");
					fname = input.nextLine();
					System.out.print("ENROLLMENT YEAR: ");
					year = input.nextInt();
					pstmt.setString(1, fname);
					pstmt.setString(2, lname);
					pstmt.setInt(3, year);
					pstmt.executeUpdate();
					rs = pstmt.getGeneratedKeys();
					if (rs.next()) {
					   id.setStudentID(rs.getInt(1));
					} 
					else {
					    System.out.println("No ID generated!");
					    System.out.println("\nDo you want to view available services again?");
						System.out.println("Type YES to continue.");
						sdecision = input.nextLine();
						if (sdecision.equalsIgnoreCase("Y")) {
							sqlmenu.menu(sdecision);
						} else {
							System.out.println("Thank you for using the program!");
						}
					}
					System.out.println("STUDENT ID: " + rs.getInt(1));
					System.out.println("You are now officially enrolled!");
					
					System.out.println("Do you want to view available subjects to enrolled? (Y/N) ");
					input.nextLine();
					sdecision = input.nextLine();
					if (sdecision.equalsIgnoreCase("Y")) {
							EnrollmentSubjects.enroll(sdecision);
						} 
					else {
							System.out.println("Thank you for using the program!");
						}
					}
				else if (decision.equalsIgnoreCase("N")){
						System.out.println("Thank you for using the program");
						sqlmenu.menu(sdecision);
					} 
				else {
						System.out.println("Invalid selection, Please try again!");
						sqlmenu.menu(sdecision);
					}
					
			con.close();
			input.close();
						
	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		}
	 }
}
