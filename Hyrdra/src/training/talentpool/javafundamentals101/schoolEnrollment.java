package training.talentpool.javafundamentals101;

import java.util.Scanner;

public class schoolEnrollment {
	public static void main (String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, Welcome to Enrollment. Please state all the details been asked.");
		System.out.print("STUDENT LAST NAME: ");
		String lname = input.nextLine();
		System.out.print("STUDENT FIRST NAME: ");
		String fname = input.nextLine();
                
		System.out.println("Subjects Available to Enrolled");
                System.out.println("1 - Filipino\n2 - English\n3 - Math\n4 - Christian Living"
                               + "\n5 - Hekasi\n6 - MAPEH\n7 - Science\n8 - TLE");
		System.out.print("Choose subject you want to enrolled: ");
		String subject = input.nextLine();
				
                switch (subject) {    
                    case "1":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at Filipino subject.");
                    break;
                    
                    case "2":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at English subject.");
                    break;
                    
                    case "3":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at Math subject.");
                    break;
                    
                    case "4":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at Christian Living subject.");
                    break;
                    
                    case "5":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at Hekasi subject.");
                    break;
                    
                    case "6":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at MAPEH subject.");
                    break;
                    
                    case "7":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at Science subject.");
                    break;
                    
                    case "8":
                        System.out.println("Hi " + fname + " " + lname + "! You are now officially enrolled at TLE subject.");
                    break;
                    
                    default:
                        System.out.println("Hi " + fname + " " + lname + "! The subject you choose is not in the selection! Please try again");
                    break;
                }		
                
                input.close();
	}
}  
