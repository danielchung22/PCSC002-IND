import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class studentscore {
		public static void main(String[] args) {
		// Declare variables
		int student,scoreperstudent,studentNum,testScore;
			
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in); 
		
		// Prompt for the number of students
		System.out.print("How many students do you have? ");
		student = keyboard.nextInt();
		if (student>0) {
		
		// Prompt entering the number of test scores per student
		System.out.print("How many test scores per student? ");
		scoreperstudent = keyboard.nextInt();
		if (scoreperstudent>0) {
				
	for (studentNum = 1; studentNum <= student; studentNum++) {
		System.out.println("\nStudent " + studentNum + "\n----------------------");
		
		// Declare variables
		double marks=0,total=0,avg=0;	
			for (testScore=1; testScore <= scoreperstudent; testScore++) {
								
		//Prompt entering of scores
			System.out.print ("Enter test score " + testScore+": ");
			marks = keyboard.nextDouble();
			if (marks<0 || marks >100) { System.out.println("Please insert valid marks");
			
			break;}
						
			total += marks; 
			avg = total / scoreperstudent;
			}	 
			
		if (marks<0 || marks>100) {
		break;} 
		
		// Round off to 1 decimal point
			BigDecimal a = new BigDecimal(total).setScale(1, RoundingMode.HALF_UP);
			BigDecimal b = new BigDecimal(avg).setScale(1, RoundingMode.HALF_UP);
				 double newtotal= a.doubleValue(),newavg= b.doubleValue();
				 
		//Output the total and average scores of the students
			System.out.println("Total score of students is " + newtotal);
			System.out.println("Average score of student is " + newavg); 
			
			}
				
		} else {
			System.out.println("Please insert a valid number of scores per student");
		}
		} else {
			System.out.println("Please insert a valid number of students");
			
		}	
	keyboard.close();	
}
}
