import java.util.Scanner;

public class classroomWork1 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		float length;
		float width;
		float height;

		String answer = "y"; // answer to the question "Do you want to calculate
								// volume?"

		String choice = "y"; // answer to the question "Do you want to calculate
								// another room?"

		while (choice.equalsIgnoreCase("y")) {

			System.out.println(
					"Welcome to the area, perimeter and volume calculator!\nPlease enter the length of the room in feet:");

			length = scan1.nextFloat(); // collects the user input on the length
										// of the room

			System.out.println("Please enter the width of the room in feet:");

			width = scan1.nextFloat(); // collects the user input on the width
										// of the room

			float area = length * width; // calculates the area of the room

			float perimeter = 2 * length + 2 * width; // calculates the perimeter of the room

			System.out.println("The area of the room is " + area + " square feet.");

			System.out.println("The perimeter of the room is " + perimeter + " feet.");

			System.out.println("Do you want to calculate the volume of the room? Type Y/N");

			answer = scan1.next(); // collects the user input if they want to figure out the volume of the room

			if (answer.equalsIgnoreCase("y")) {

				System.out.println("Enter the height of the room in feet:");

				height = scan1.nextFloat(); // collects the user input on the height of the room

				float volume = length * width * height; // calculates the volume of the room

				System.out.println("The volume of the room is " + volume + " cubic feet.");

				System.out.println("Do you want to calculate another room? Type Y/N");

				choice = scan1.next(); // collects the user input if they want to calculate another room

			}

			else {

				System.out.println("Do you want to calculate another room? Type Y/N");

				choice = scan1.next();
				/*allows the user to calculate another room without having to
				 * calculate the volume of the previous room
				 */

			}

		}
		scan1.close();

	}

}
