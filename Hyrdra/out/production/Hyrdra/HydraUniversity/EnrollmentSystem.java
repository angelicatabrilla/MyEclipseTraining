package HydraUniversity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class EnrollmentSystem {
	 static void enroll (String enroll) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Connection con = AccountConnectionDB.getInstance().getConnection();
				
				String updateQuery = "INSERT INTO interns(firstname, lastname, yearSection) VALUES (?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(updateQuery);
		
				
				System.out.println("\nDo you want to enrolled? (Y/N) ");
				String decision = input.nextLine();
					if (decision.equalsIgnoreCase("Y")) {
						System.out.println("\nHello, Welcome to Enrollment. "
								+ "Please state all the details been asked.");
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
						
						System.out.println("Do you want to view available subjects to enrolled? (Y/N) ");
						String sdecision = input.nextLine();
							if (sdecision.equalsIgnoreCase("Y")) {
								Subjects.enroll(sdecision);
							}
							else {
								System.out.println("Thank you for using the program!");
							}
					}
					else if (decision.equalsIgnoreCase("N")){
							System.out.println("Thank you for using the program");
						}								
					else {
						System.out.println("Sorry. The answer you choose is not answerable by this machine! Please try again!");
					}
					
			con.close();
			input.close();
						
	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		
	}
}
}
