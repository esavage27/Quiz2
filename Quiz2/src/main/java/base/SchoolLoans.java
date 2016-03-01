package base;

import java.text.DecimalFormat;

public class SchoolLoans {
	
	//defining some private variables
	private double tuition;
	private double percent;
	private double interest;
	private double years;
	
	//constructor for SchoolLoans class
	public SchoolLoans(double tuition, double percent, double interest, double years) {
		this.tuition = tuition;
		this.percent = percent;
		this.interest = interest;
		this.years = years;
	}
	
	//calculating the total tuition amount and then loan payment per month. Assuming no
	//interest on the loan until after graduation
	public static double LoanCalc(double tuition, double percent, double interest, double years){
		
		//for monthlypayment calculation
		double r = interest / 12;
		double n = years * 12;
		
		//finding the total mount of tuition cost after 4 years including the % increase
		double totaltuition = tuition * (1 + (1+percent) + Math.pow(1+percent, 2)+ Math.pow(1+percent,3));
		
		//finding the monthly payment amount using the payment formula
		double monthlypayment = r * totaltuition / (1-Math.pow(1 + r, -n));
		
		//rounding the monthly payment found above to 2 decimal places
		DecimalFormat df = new DecimalFormat("####.##");
		System.out.println("The monthly payment for your loan is: $" + df.format(monthlypayment));
		return monthlypayment;
	}
}