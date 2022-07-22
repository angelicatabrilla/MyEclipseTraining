package HydraUniversity;

import java.util.Scanner;

public class Menu {
	
	 void menu (String enrollmentMenu) {
		 
		Menu sqlmenu = new Menu();
		Scanner input = new Scanner(System.in);
			
		System.out.println("Here are the Available Services");
		System.out.println(" 1 - Enroll New Student\n 2 - Enroll student to a Subject\n"
				+ " 3 - View Enrolled Students\r\n "
					+ "4 - Check Student Year Level\n 5 - Other Functions");
		System.out.print("Choose a service: ");
		String service = input.nextLine();
		
		switch (service) {    
			case "1":
				EnrollmentSystem.enroll(service);								
				break;
				
			case "2":
				Subjects.enroll(service);
				break;
       
			case "3":
				EnrolledStudents.enrolled(service);
				break;
       
			case "4":
				StudentLevel.yearlevel(service);
				break;	
				
			case "5":
				MenuFunctions.funcmenu(service);
				break;	
		
			default:
				System.out.println("\nHi " + enrollmentMenu + "! The function you choose it not on the list! Please try again!\n");
				sqlmenu.menu(service);
				break;
			}

		input.close();

	}

}
