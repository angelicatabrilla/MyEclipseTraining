package Debug;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vote {
	
	public static Result elect(Detail detail) {
		Result result = new Result();
		DecimalFormat df = new DecimalFormat("0.00");		
		float total = detail.getVote1()+detail.getVote2()+detail.getVote3()+detail.getVote4()+detail.getVote5();
		result.setTotal(total);
		result.setCandVote1("\n" + detail.getCandidate1() + " - " + detail.getVote1() + " || " + df.format((detail.getVote1() * 100) / total) + "%");
		result.setCandVote2("\n" + detail.getCandidate2() + " - " + detail.getVote2() + " || " + df.format((detail.getVote2() * 100) / total) + "%");
		result.setCandVote3("\n" + detail.getCandidate3() + " - " + detail.getVote3() + " || " + df.format((detail.getVote3() * 100) / total) + "%");
		result.setCandVote4("\n" + detail.getCandidate4() + " - " + detail.getVote4() + " || " + df.format((detail.getVote4() * 100) / total) + "%");
		result.setCandVote5("\n" + detail.getCandidate5() + " - " + detail.getVote5() + " || " + df.format((detail.getVote5() * 100) / total) + "%");
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detail detail = new Detail();
		Result result = new Result();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st Candidate Name: ");
		detail.setCandidate1(scan.nextLine());
		System.out.print("Enter 2nd Candidate Name: ");
		detail.setCandidate2(scan.nextLine());
		System.out.print("Enter 3rd Candidate Name: ");
		detail.setCandidate3(scan.nextLine());
		System.out.print("Enter 4th Candidate Name: ");
		detail.setCandidate4(scan.nextLine());
		System.out.print("Enter 5th Candidate Name: ");
		detail.setCandidate5(scan.nextLine());
		System.out.print("Enter 1st Candidate Vote: ");
		detail.setVote1(scan.nextInt());
		System.out.print("Enter 2nd Candidate Vote: ");
		detail.setVote2(scan.nextInt());
		System.out.print("Enter 3rd Candidate Vote: ");
		detail.setVote3(scan.nextInt());
		System.out.print("Enter 4th Candidate Vote: ");
		detail.setVote4(scan.nextInt());
		System.out.print("Enter 5th Candidate Vote: ");
		detail.setVote5(scan.nextInt());
		result = elect(detail);
		System.out.println(result.getCandVote1());
		System.out.println(result.getCandVote2());
		System.out.println(result.getCandVote3());
		System.out.println(result.getCandVote4());
		System.out.println(result.getCandVote5());
		System.out.println("\nTotal Vote Count is " + result.getTotal());
	}

}
