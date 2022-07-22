package HydraUniversity;

import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
		Menu sqlmenu = new Menu();
		
		System.out.println("+---------------------------------------+");
		System.out.println("|     Welcome to Hydra University       |");
		System.out.println("+---------------------------------------+");
		
		System.out.print("\nWhat is your name? ");
		String name = input.nextLine();
		System.out.println("\nHi " + name + "!");
		sqlmenu.menu(name);
		
		input.close();
	}
}

