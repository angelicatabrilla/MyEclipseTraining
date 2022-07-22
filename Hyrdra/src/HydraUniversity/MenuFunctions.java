package HydraUniversity;

import java.util.Scanner;

public class MenuFunctions {
	
	 static void funcmenu (String funcmenu) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("\nHere are the Other Available Functions");
		System.out.println(" 1 - Edit Profile\n 2 - Students and Enrolled Subjects\n 3 - Delete Subject\n 4 - Delete Student");
		System.out.print("Choose a function: ");
		String functionsmenu = input.nextLine();
		
		switch (functionsmenu) {    
			case "1":
				EditProfile.change_fname(functionsmenu);							
				break;
				
			case "2":
				Functions.enrolledSubjects(functionsmenu);
				break;	
				
			case "3":
				Functions.deleteSubject(functionsmenu);
				break;
			
			case "4":
				Functions.deleteStudent(functionsmenu);
				break;
			default:
				System.out.println("You have entered an invalid function, Please try again!");
				MenuFunctions.funcmenu(functionsmenu);
				break;	
			}

		input.close();

	}

}
