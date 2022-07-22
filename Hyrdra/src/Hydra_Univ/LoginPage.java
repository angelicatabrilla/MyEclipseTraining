package Hydra_Univ;

import java.util.Scanner;


public class LoginPage {
	
	public static void main(String[]args) {
		StudentLogin sLogin = new StudentLogin();
		Scanner input = new Scanner(System.in);

		String decision = "";
		
			System.out.println("+---------------------------------------+");
			System.out.println("|     Welcome to Hydra University       |");
			System.out.println("+---------------------------------------+");
			
			System.out.print("\nUser types: \n\t(S)Student or (T)Teacher");
			System.out.print("\nEnter user type: ");
			decision = input.nextLine();
			if (decision.equalsIgnoreCase("S")) {
				StudentLogin.studentLogin(decision);
			}
			else if (decision.equalsIgnoreCase("T")){
				FacultyLogin.facultyLogin(decision);
			} 
			else {
				System.out.println("Invalid selection, Please try again!");
			}
			
			input.close();
		}
}
