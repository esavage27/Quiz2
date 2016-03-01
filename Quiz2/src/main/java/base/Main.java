package base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//defining variables
		double TuitionCost, PercentIncrease, APR, Term;
		
		//Using scanner to obtain the necessary variable values
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the yearly tuition cost:");
		TuitionCost = input.nextDouble();

		System.out.println("Enter the yearly percent increase for tuition:");
		PercentIncrease = input.nextDouble();
		
		System.out.println("Enter APR for your student loans:");
		APR = input.nextDouble();
		
		System.out.println("Enter the number of years you plan to take to repay your loan:");
		Term = input.nextDouble();
		
		input.close();
		
		//calling the method that does the calculations using the numbers just brought
		//in from the scanners
		SchoolLoans.LoanCalc(TuitionCost,PercentIncrease,APR,Term);
	}
}
