package HydraUniversity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Subjects {
	 static void enroll (String enroll) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Connection con = AccountConnectionDB.getInstance().getConnection();
				
				java.sql.Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM batch3.interns");
						
				System.out.println("\n+---------------+----------------------------+");
				System.out.println("|  STUDENT ID   |      ENROLLED STUDENTS     |");
				System.out.println("+---------------+----------------------------+");
						
				while (rs.next()) {
					System.out.print("      "+ rs.getInt("id"));
					System.out.println("         "+rs.getString("firstname") + " " +rs.getString("lastname"));
				}
				
				System.out.println("+---------------------+");
				System.out.println("|  AVAILABLE SUBJECTS |");
				System.out.println("+---------------------+");
				
				System.out.println(" 1 - Filipino\n 2 - English\n 3 - Math\n 4 - Christian Living"
                        + "\n 5 - Hekasi\n 6 - MAPEH\n 7 - Science\n 8 - TLE");
				
							
				String updateQuery = "INSERT INTO batch3.registration (studentID, subjectID) VALUES (?,?)";
				PreparedStatement pstmt = con.prepareStatement(updateQuery);	
										
				System.out.print("\nInput your Student ID: ");
				String studentID = input.nextLine();
				System.out.print("Input subject number you want to enroll: ");
				String subjectID = input.nextLine();
				
				switch (subjectID) {
				case "1":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans1 = input.nextLine();
					if (ans1.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans1.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}							
					break;	
				case "2":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans2 = input.nextLine();
					if (ans2.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans2.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}							
					break;	
				case "3":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans3 = input.nextLine();
					if (ans3.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans3.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}							
					break;
				case "4":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans4 = input.nextLine();
					if (ans4.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans4.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}								
					break;
				case "5":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans5 = input.nextLine();
					if (ans5.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans5.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}						
					break;
				case "6":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans6 = input.nextLine();
					if (ans6.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans6.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}							
					break;
				case "7":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans7 = input.nextLine();
					if (ans7.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans7.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}								
					break;
				case "8":
					System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
					String ans8 = input.nextLine();
					if (ans8.equalsIgnoreCase("Y")) {
						pstmt.setString(1,studentID);
						pstmt.setString(2,subjectID);
						pstmt.executeUpdate();
						System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					} else if (ans8.equalsIgnoreCase("N")) {
						System.out.println("Okay, Thank you for using the program!");
					} else {
						System.out.println("Sorry. We do not recognized your answer! Please try again!");
						Subjects.enroll(subjectID);
						}						
					break;
				default:
					System.out.println("You have entered an invalid subject number, Please try again!");
					Subjects.enroll(subjectID);
					break;
				}

				con.close();
				input.close();

	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		
		}
	 }
}