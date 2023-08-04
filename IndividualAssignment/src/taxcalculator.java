import java.util.Scanner;

public class taxcalculator {
	public static void main(String[] args) {

		//Create a scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		
		//Declare variables
		int filingstatus;
		double TaxableIncome=0, TotalTax=0;
		double TaxRate=0.10, TaxRate2=0.15, TaxRate3=0.25, TaxRate4=0.28, TaxRate5=0.33, TaxRate6=0.35;
		
		//Prompt for entering of filing status
		System.out.println("Please enter your filing status");
		System.out.println("0 - Single");
		System.out.println("1 - Married Filing Jointly or Qualified Widow(er)");
		System.out.println("2 - Married Filing Separately");
		System.out.println("3 - Head of Household");
		filingstatus=keyboard.nextInt();
			
		//Prompt for entering of taxable income
		System.out.println("\nPlease enter your taxable income");
		TaxableIncome=keyboard.nextDouble();
		
		//For single filers
		if (filingstatus == 0) {
			//Declare variables for single filers
			int RateCap1 = 8350, RateCap2 = 33950, RateCap3 = 82250, RateCap4 = 171550, RateCap5 = 372950;
			double  IncomeRemain2 = RateCap2 - RateCap1, IncomeRemain3 = RateCap3 - RateCap2, 
					IncomeRemain4 = RateCap4 - RateCap3, IncomeRemain5 = RateCap5 - RateCap4, 
					IncomeRemain6 = 0;
			double  TaxToPay  = RateCap1 * TaxRate,    TaxToPay2 = IncomeRemain2 * TaxRate2,
					TaxToPay3 = IncomeRemain3 * TaxRate3, TaxToPay4 = IncomeRemain4 * TaxRate4,
					TaxToPay5 = IncomeRemain5 * TaxRate5, TaxToPay6 = 0;
			
			if ((TaxableIncome >= 0) && (TaxableIncome <= RateCap1)) {
				TotalTax = TaxableIncome * TaxRate;
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap1 ) && (TaxableIncome <= RateCap2 )) {
				IncomeRemain6 = TaxableIncome - RateCap1;
				TaxToPay6 = IncomeRemain6 * TaxRate2;
				TotalTax = TaxToPay + TaxToPay6;
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
		
			else if ((TaxableIncome > RateCap2 ) && (TaxableIncome <= RateCap3 )) {
				IncomeRemain6 = TaxableIncome - RateCap2;
				TaxToPay6 = IncomeRemain6 * TaxRate3;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap3 ) && (TaxableIncome <= RateCap4 )) {
				IncomeRemain6 = TaxableIncome - RateCap3;
				TaxToPay6 = IncomeRemain6 * TaxRate4;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap4 ) && (TaxableIncome <= RateCap5 )) {
				IncomeRemain6 = TaxableIncome - RateCap4;
				TaxToPay6 = IncomeRemain6 * TaxRate5;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap5 )) {
				IncomeRemain6 = TaxableIncome - RateCap5;
				TaxToPay6 = IncomeRemain6 * TaxRate6;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay5 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else {
			System.out.println("Please insert a valid taxable income");}						
		}
		
		//For married filing jointly or qualified widower
		else if (filingstatus == 1) {
			//Declare variables for married filing jointly or qualified widower
			int RateCap1 = 16700, RateCap2 = 67900, RateCap3 = 137050, RateCap4 = 208850, RateCap5 = 372950;
			double  IncomeRemain2 = RateCap2 - RateCap1, IncomeRemain3 = RateCap3 - RateCap2, 
					IncomeRemain4 = RateCap4 - RateCap3, IncomeRemain5 = RateCap5 - RateCap4, 
					IncomeRemain6 = 0;
			double  TaxToPay  = RateCap1 * TaxRate,    TaxToPay2 = IncomeRemain2 * TaxRate2,
					TaxToPay3 = IncomeRemain3 * TaxRate3, TaxToPay4 = IncomeRemain4 * TaxRate4,
					TaxToPay5 = IncomeRemain5 * TaxRate5, TaxToPay6 = 0;
			
			if ((TaxableIncome >= 0) && (TaxableIncome <= RateCap1)) {
				TotalTax = TaxableIncome * TaxRate;
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap1 ) && (TaxableIncome <= RateCap2 )) {
				IncomeRemain6 = TaxableIncome - RateCap1;
				TaxToPay6 = IncomeRemain6 * TaxRate2;
				TotalTax = TaxToPay + TaxToPay6;
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
		
			else if ((TaxableIncome > RateCap2 ) && (TaxableIncome <= RateCap3 )) {
				IncomeRemain6 = TaxableIncome - RateCap2;
				TaxToPay6 = IncomeRemain6 * TaxRate3;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap3 ) && (TaxableIncome <= RateCap4 )) {
				IncomeRemain6 = TaxableIncome - RateCap3;
				TaxToPay6 = IncomeRemain6 * TaxRate4;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap4 ) && (TaxableIncome <= RateCap5 )) {
				IncomeRemain6 = TaxableIncome - RateCap4;
				TaxToPay6 = IncomeRemain6 * TaxRate5;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else if ((TaxableIncome > RateCap5 )) {
				IncomeRemain6 = TaxableIncome - RateCap5;
				TaxToPay6 = IncomeRemain6 * TaxRate6;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay5 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
			
			else {
			System.out.println("Please insert a valid taxable income");}						
		}
		
		//For married filing separately
		else if (filingstatus == 2) {
			//Declare variables for married filing separately
			int RateCap1 = 8350, RateCap2 = 33950, RateCap3 = 68525, RateCap4 = 104425, RateCap5 = 186475;
			double  IncomeRemain2 = RateCap2 - RateCap1, IncomeRemain3 = RateCap3 - RateCap2, 
					IncomeRemain4 = RateCap4 - RateCap3, IncomeRemain5 = RateCap5 - RateCap4, 
					IncomeRemain6 = 0;
			double  TaxToPay  = RateCap1 * TaxRate,    TaxToPay2 = IncomeRemain2 * TaxRate2,
					TaxToPay3 = IncomeRemain3 * TaxRate3, TaxToPay4 = IncomeRemain4 * TaxRate4,
					TaxToPay5 = IncomeRemain5 * TaxRate5, TaxToPay6 = 0;
				
			if ((TaxableIncome >= 0) && (TaxableIncome <= RateCap1)) {
				TotalTax = TaxableIncome * TaxRate;
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
				
			else if ((TaxableIncome > RateCap1 ) && (TaxableIncome <= RateCap2 )) {
				IncomeRemain6 = TaxableIncome - RateCap1;
				TaxToPay6 = IncomeRemain6 * TaxRate2;
				TotalTax = TaxToPay + TaxToPay6;
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
				
			else if ((TaxableIncome > RateCap2 ) && (TaxableIncome <= RateCap3 )) {
				IncomeRemain6 = TaxableIncome - RateCap2;
				TaxToPay6 = IncomeRemain6 * TaxRate3;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
			else if ((TaxableIncome > RateCap3 ) && (TaxableIncome <= RateCap4 )) {
				IncomeRemain6 = TaxableIncome - RateCap3;
				TaxToPay6 = IncomeRemain6 * TaxRate4;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
			else if ((TaxableIncome > RateCap4 ) && (TaxableIncome <= RateCap5 )) {
				IncomeRemain6 = TaxableIncome - RateCap4;
				TaxToPay6 = IncomeRemain6 * TaxRate5;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
			else if ((TaxableIncome > RateCap5 )) {
				IncomeRemain6 = TaxableIncome - RateCap5;
				TaxToPay6 = IncomeRemain6 * TaxRate6;
				TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay5 + TaxToPay6;	
			String RoundedTotalTax = String.format("%.2f", TotalTax);
			System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
			else {
			System.out.println("Please insert a valid taxable income");}						
		}
		
		//For Head of Household
			else if (filingstatus == 3) {
				//Declare variables for Head of Household
				int RateCap1 = 11950, RateCap2 = 45500, RateCap3 = 117450, RateCap4 = 190200, RateCap5 = 372950;
				double  IncomeRemain2 = RateCap2 - RateCap1, IncomeRemain3 = RateCap3 - RateCap2, 
						IncomeRemain4 = RateCap4 - RateCap3, IncomeRemain5 = RateCap5 - RateCap4, 
						IncomeRemain6 = 0;
				double  TaxToPay  = RateCap1 * TaxRate,    TaxToPay2 = IncomeRemain2 * TaxRate2,
						TaxToPay3 = IncomeRemain3 * TaxRate3, TaxToPay4 = IncomeRemain4 * TaxRate4,
						TaxToPay5 = IncomeRemain5 * TaxRate5, TaxToPay6 = 0;
					
				if ((TaxableIncome >= 0) && (TaxableIncome <= RateCap1)) {
					TotalTax = TaxableIncome * TaxRate;
				String RoundedTotalTax = String.format("%.2f", TotalTax);
				System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
				
				else if ((TaxableIncome > RateCap1 ) && (TaxableIncome <= RateCap2 )) {
					IncomeRemain6 = TaxableIncome - RateCap1;
					TaxToPay6 = IncomeRemain6 * TaxRate2;
					TotalTax = TaxToPay + TaxToPay6;
				String RoundedTotalTax = String.format("%.2f", TotalTax);
				System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
				
				else if ((TaxableIncome > RateCap2 ) && (TaxableIncome <= RateCap3 )) {
					IncomeRemain6 = TaxableIncome - RateCap2;
					TaxToPay6 = IncomeRemain6 * TaxRate3;
					TotalTax = TaxToPay + TaxToPay2 + TaxToPay6;	
				String RoundedTotalTax = String.format("%.2f", TotalTax);
				System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
				else if ((TaxableIncome > RateCap3 ) && (TaxableIncome <= RateCap4 )) {
					IncomeRemain6 = TaxableIncome - RateCap3;
					TaxToPay6 = IncomeRemain6 * TaxRate4;
					TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay6;	
				String RoundedTotalTax = String.format("%.2f", TotalTax);
				System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
				else if ((TaxableIncome > RateCap4 ) && (TaxableIncome <= RateCap5 )) {
					IncomeRemain6 = TaxableIncome - RateCap4;
					TaxToPay6 = IncomeRemain6 * TaxRate5;
					TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay6;	
				String RoundedTotalTax = String.format("%.2f", TotalTax);
				System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
				else if ((TaxableIncome > RateCap5 )) {
					IncomeRemain6 = TaxableIncome - RateCap5;
					TaxToPay6 = IncomeRemain6 * TaxRate6;
					TotalTax = TaxToPay + TaxToPay2 + TaxToPay3 + TaxToPay4 + TaxToPay5 + TaxToPay6;	
				String RoundedTotalTax = String.format("%.2f", TotalTax);
				System.out.println("The amount of tax to pay is $" + RoundedTotalTax);}
					
				else {
				System.out.println("Please insert a valid taxable income");}						
			}
		
			else {
			System.out.println("Please insert a valid filing status");}
		
			keyboard.close();
}
}	 
