package training.talentpool.javafundamentals101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class viewEnrollment {
	public static void main (String[]args) {
		try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/batch3", "root", "Artabrilla9699");
			
			String updateQuery = "INSERT INTO interns(firstname, lastname) VALUES (?,?)";
//			String query = "SELECT * FROM interns WHERE lastname = ?";
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			

			Scanner input = new Scanner(System.in);
			
//			pstmt.setString(1, lname);
//			ResultSet rs = null; //pstmt.executeQuery();
			
			System.out.println("Hello, Welcome to Enrollment. Please state all the details been asked.");
			System.out.print("STUDENT LAST NAME: ");
			String lname = input.nextLine();
			System.out.print("STUDENT FIRST NAME: ");
			String fname = input.nextLine();
//			System.out.print("Enter ID Number: ");
//			int id = 1006;
			System.out.println("Do you want to enrolled? (Y/N) ");
			String decision = input.nextLine();
				if (decision.equalsIgnoreCase("Y")) {
//					pstmt.setInt(1, id);
					pstmt.setString(1, fname);
					pstmt.setString(2, lname);
					pstmt.executeUpdate();
					System.out.println("You are now officially enrolled!");
				}
					else if (decision.equalsIgnoreCase("N")){
						System.out.println("Thank you!");
					}
					else {
						System.out.println("Hi " + fname + " " + lname + "! It is not in the selection! Please try again");
				}
//			System.out.println("Subjects Available to Enrolled");
//            System.out.println("1 - Filipino\n2 - English\n3 - Math\n4 - Christian Living"
  //                         + "\n5 - Hekasi\n6 - MAPEH\n7 - Science\n8 - TLE");
//			System.out.print("Choose subject you want to enrolled: ");
//			String subject = input.nextLine();
					
			
			//ResultSet rs = pstmt.executeQuery("SELECT * FROM batch3.interns WHERE lastname = ?");
			//rs.getObject(lname);
			
//			System.out.println("\n+----------------------------+---------------------------+");
//			System.out.println("|      ENROLLED STUDENTS     |     SUBJECTS ENROLLED     |");
//			System.out.println("+----------------------------+---------------------------+");
						
			
//			while (rs.next()) {
//				System.out.println("       " + rs.getString("firstname") + " " +rs.getString("lastname"));
//				}
				
			con.close();
			
//			switch (subject) {    
//           case "1":
//                System.out.println("      " + fname + " " + lname + "                Filipino");
 //           break;
            
//            case "2":
//                System.out.println("      " + fname + " " + lname + "                English");
//            break;
            
//            case "3":
//                System.out.println("      " + fname + " " + lname + "                Math");
//            break;
            
//            case "4":
//                System.out.println("      " + fname + " " + lname + "              Christian Living");
//            break;
            
//            case "5":
//                System.out.println("      " + fname + " " + lname + "               Hekasi");
 //           break;
            
 //           case "6":
 //               System.out.println("      " + fname + " " + lname + "               MAPEH");
 //           break;
            
//            case "7":
//                System.out.println("      " + fname + " " + lname + "               Science");
//            break;
            
//            case "8":
//                System.out.println("      " + fname + " " + lname + "               TLE");
//            break;
//            
//            default:
//                System.out.println("Hi " + fname + " " + lname + "! The subject you choose is not in the selection! Please try again");
//            break;
//			}
			
			System.out.println("+----------------------------+---------------------------+");
			
			input.close();
			
			
			
		}	catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();
			
		}
		
		
	}
}
