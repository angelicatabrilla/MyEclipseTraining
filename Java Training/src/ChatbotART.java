import java.util.Scanner;

public class ChatbotART {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Hello, What is your name? ");
		String name = input.nextLine();
		System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
		String place = input.nextLine();
		System.out.println("I hear it's beautiful at " + place + "! I'm from a place called Oracle.");
		System.out.println("How old are you?");
		String age = input.nextLine();
		System.out.println("So you're " + age + ", cool! I'm 400 years old.");
		System.out.println("Enough about me. What's your favorite language?");
		System.out.println("(just don't say Python)");
		String language = input.nextLine();
		System.out.println(language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
		
		input.close();
		
	}
}
