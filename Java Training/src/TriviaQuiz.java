import java.util.Scanner;

public class TriviaQuiz {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		int score = 0;
		
		do {
			System.out.println("**********************************");
			System.out.print("What is your name? ");
			String name = input.nextLine();
			
			System.out.println("\n+----------------------------------------------+");
			System.out.println("  Hello " + name + "! Welcome to Trivia Quiz!");
			System.out.println("+----------------------------------------------+");
			
			System.out.print("Which country held the 2016 Summer Olympics?\n"
					+ " a) China\n b) Ireland\n c) Brazil\n d) Italy");
			System.out.print("\nAnswer: ");
			String ans1 = input.nextLine();
				if (ans1.equalsIgnoreCase("c")) {
					score = score + 5;
					
					System.out.print("\nWhich planet is the hottest?\n"
							+ " a) Venus\n b) Saturn\n c) Mercury\n d) Mars");
					System.out.print("\nAnswer: ");
					String ans2 = input.nextLine();
					if (ans2.equalsIgnoreCase("a")) {
						score = score + 5;
						
						System.out.print("\nWhat is the rarest blood type?\n"
								+ " a) O\n b) A\n c) B\n d) AB-Negative");
						System.out.print("\nAnswer: ");
						String ans3 = input.nextLine();
						if (ans3.equalsIgnoreCase("d")) {
							score = score + 5;

							System.out.print("\nWhich one of these characters is friends with Harry Potter?\n"
									+ " a) Ron Weasly\n b) Hermione Granger\n c) Draco Malfoy");
							System.out.print("\nAnswer: ");
							String ans4 = input.nextLine();
							if (ans4.equalsIgnoreCase("a")) {
								score = score + 5;
								System.out.println("Your final score is " + score + "/20");
								System.out.println("Wow, you know your stuff!");
							}
							else if (ans4.equalsIgnoreCase("b")) {
								score = score + 5;
								System.out.println("\n\nYour final score is " + score + "/20");
								System.out.println("Wow, you know your stuff!");
							}
							else {
								System.out.println("\nHi " + name + ". You got that wrong!");
								System.out.println("You earn " + score + "/20 points.");
							}
						}
						else {
							System.out.println("\nHi " + name + ". You got that wrong!");
							System.out.println("You earn " + score + "/20 points.");
						}
						
					}
					else {
						System.out.println("\nHi " + name + ". You got that wrong!");
						System.out.println("You earn " + score + "/20 points.");
					}
					}
				else {
					System.out.println("\nHi " + name + ". You got that wrong!");
					System.out.println("You earn " + score + "/20 points.");
				}
		
		System.out.println("\nDo you like to play again?");
		System.out.println("Type YES to continue.");
	
		
		}
		while (input.nextLine().equalsIgnoreCase("YES"));
			
			input.close();
			
	}		
}

	

