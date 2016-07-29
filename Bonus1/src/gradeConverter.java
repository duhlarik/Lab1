import java.util.Scanner;

public class gradeConverter {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		int numberGrade;

		String answer = "yes";
		
		System.out.println("Welcome to the Letter Grade Converter!");

		while (answer.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter a numerical grade as a whole number:");

			numberGrade = scan1.nextInt();
			scan1.nextLine();
			
			if (numberGrade >= 90) {
				
				System.out.println("Your letter grade is A.");
			}
			
			else if (numberGrade >79) {
				
				System.out.println("Your letter grade is B.");
			}
			
			else if (numberGrade >69) {
				
				System.out.println("Your letter grade is C.");
			}
			
			else if (numberGrade >59) {
				
				System.out.println("Your letter grade is a D.");
			}
			
			else if (numberGrade <60) {
				
				System.out.println("Your letter grade is an F.");
			}
			
			System.out.println("Do you want to enter another grade?");
			
			answer = scan1.nextLine();
			
		}
		
		System.out.println("Goodbye!");

		scan1.close();
	}

}
