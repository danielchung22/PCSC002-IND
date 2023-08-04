import java.util.Scanner;
public class zodiacsignfinder {

	public static void main(String[] args) {
		int year,remainder; //The year of birth of the user, the current year divisible by 4
		
		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the year of birth from user
		System.out.println("Please insert your year of birth");
		year=keyboard.nextInt();
		
		//Determine remainder
		remainder=year%12;
		switch (remainder)
		{
		case 0: 
			{System.out.println("monkey");}
			break;
		case 1:
			{System.out.println("rooster");}
			break;
		case 2:
			{System.out.println("dog");}
			break;
		case 3:
			{System.out.println("pig");}
			break;
		case 4:
			{System.out.println("rat");}
			break;
		case 5:
			{System.out.println("ox");}
			break;
		case 6:
			{System.out.println("tiger");}
			break;
		case 7:
			{System.out.println("rabbit");}
			break;
		case 8:
			{System.out.println("dragon");}
			break;
		case 9:
			{System.out.println("snake");}
			break;
		case 10:
			{System.out.println("horse");}
			break;
		case 11:
			{System.out.println("sheep");}
			break;
		default:
		{System.out.println("Please insert a valid year");}
		}
		keyboard.close();
	}
	
}
