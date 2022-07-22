package HydraUniversity;

import java.util.Scanner;

public class MenuFunctions {
	
	 static void funcmenu (String funcmenu) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("\nHere are the Other Available Functions");
		System.out.println(" 1 - Change First Name\n 2 - Change Last Name\n"
				+ " 3 - Change Year Level\r\n "
					+ "4 - Delete a Subject\n 5 - Students and Enrolled Subjects");
		System.out.print("Choose a function: ");
		String functionsmenu = input.nextLine();
		
		switch (functionsmenu) {    
			case "1":
				Functions.change_firstname(functionsmenu);							
				break;
				
			case "2":
				Functions.change_lastname(functionsmenu);	
				break;
       
			case "3":
				Functions.change_yearlevel(functionsmenu);
				break;
       
			case "4":
				Functions.change_yearlevel(functionsmenu);
				break;	
				
			case "5":
				Functions.enrolledSubjects(functionsmenu);
				break;	
				
		
			default:
				System.out.println("The function you choose is not in the selection! Please try again!");
				break;
				
			}
		
		
		input.close();

	}

}
