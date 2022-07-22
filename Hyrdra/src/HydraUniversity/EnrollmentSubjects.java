package HydraUniversity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EnrollmentSubjects {
	 static void enroll (String enroll) {
		 
		 Menu sqlmenu = new Menu();
		 
		 Scanner input = new Scanner(System.in);
		 
	     ClassID id = new ClassID();
	     int studentID = id.getStudentID();

		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Connection con = AccountConnectionDB.getInstance().getConnection();
				
			String sdecision = "";
			String ans = "";
			String subjectID = "";
			
			System.out.println("+---------------------+");
			System.out.println("|  AVAILABLE SUBJECTS |");
			System.out.println("+---------------------+");
				
			System.out.println(" 1 - Filipino\n 2 - English\n 3 - Math\n 4 - Christian Living"
                        + "\n 5 - Calculus\n 6 - Physics\n 7 - Chemistry\n 8 - Physical Education");
									
		            
		    String updateQuery = "INSERT INTO batch3.registration (studentID, subjectID) VALUES (?,?)";
			PreparedStatement pstmt = con.prepareStatement(updateQuery);						
					
				System.out.print("Input subject you want to enroll: ");
				subjectID = input.nextLine();
					
				System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
				ans = input.nextLine();
					
				if (ans.equalsIgnoreCase("Y")) {
					pstmt.setInt(1, studentID);
					pstmt.setString(2, subjectID);
					pstmt.executeUpdate();
					System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
				} else if (ans.equalsIgnoreCase("N")) {
					System.out.println("Okay, Thank you for using the program!");
					System.out.println("\nDo you want to view available services again?");
					System.out.println("Type YES to continue.");
					sdecision = input.nextLine();
					if (sdecision.equalsIgnoreCase("Y")) {
						sqlmenu.menu(sdecision);
					} else {
						System.out.println("Thank you for using the program!");
					}
						}
				else {
					System.out.println("Sorry. Kindly input a valid selection! Please try again!");
					EnrollmentSubjects.enroll(ans);
				}
				
			con.close();
			input.close();

	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		}
	 }
}


