package training.talentpool.javafundamentals101;

import java.util.Scanner;

public class index {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		myFunctions func = new myFunctions();		

		
//		System.out.print("Write your First Name: ");
//		String fname = input.nextLine();
//		System.out.print("Write your Last Name: ");
//		String lname = input.nextLine();
//		System.out.print("What is your Student ID: ");
//		String studentID = input.nextLine();
//		func.StudentID(studentID);
//		func.Fullname(fname + " " + lname);
		
//		System.out.print("Enter the Distance in Miles: ");
//		Double miles = input.nextDouble();
////		Double km = func.milesToKm(miles);
//		System.out.println("Distance in kilometers: " + func.milesToKm(miles));
		
//		System.out.print("Please enter value of N: ");
//	    int num = input.nextInt();
//		func.rightTriangle(num);
	    

//		System.out.print("Enter days of work: ");
//		Double days = input.nextDouble();
//		System.out.print("Enter your total salary: ");
//		Double salary = input.nextDouble();
//		func.workingSalary(salary / days);
		
		
		System.out.print("Enter your word: ");
		String word = input.nextLine();
		func.char_count(word);
		
		input.close();
	}
}
