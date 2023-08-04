import java.util.Scanner;
public class theatertickets {

	public static void main(String[] args) {
		// Declare variables
		int day, age;
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt for input of the day
		System.out.println("Please insert the day - 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday, 7 for Sunday");
		day = keyboard.nextInt();
				
		// Prompt for input of age
		System.out.println("Please insert your age");
		age = keyboard.nextInt();
			
		//Determine the day and the age and the output
		switch (day)  {
		case 1: 
		case 2:
		case 3:
		case 4:
			if (age >=0 && age<10 || age >65) {System.out.println("Free");}
			else if (age>=10 && age<=65) {System.out.println("RM10");}
			else {System.out.println("Please insert a valid age");}
			break;
		case 5:
		case 6:
		case 7:
			if (age >=0 && age<10 || age >65) {System.out.println("RM10");}
			else if (age>=10 && age<=65) {System.out.println("RM20");}
			else {System.out.println("Please insert a valid age");}
			break;
		default: {System.out.println("Please insert a valid day");}
		}
		keyboard.close(); 
		} 

	}
