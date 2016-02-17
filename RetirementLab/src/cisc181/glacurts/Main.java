package cisc181.glacurts;

import java.util.Scanner;
import java.lang.Math.*;

public class Main {


	public static void main(String[] args) {
		
		double Savings, savingsMonthly;
		
		
		
		//Creates Scanner object to collect user input
		Scanner scanner = new Scanner(System.in);
		
		//Equation 1
		
		//User enters the number of years they expect to be retired
		System.out.println("Enter the number of years you expect to draw: ");
		int yearsRetired = scanner.nextInt();
		
		//User enters their annual return
		System.out.println("Enter your expected annual return on investment: ");
		
		//Monthly calculation
		int annualReturn = scanner.nextInt();
		
		//User enters the required retirement income
		System.out.println("Enter your required retirement income: ");
		double requiredIncome = scanner.nextDouble();
		
		//User enters the monthly SSI
		System.out.println("Enter your expected SSI income: ");
		double monthlySSI = scanner.nextDouble();
		
		//Equation 2
				
		//User enters the number of years they expect to work
		System.out.println("Enter the number of years you expect to work: ");
		int yearsToWork = scanner.nextInt();
		
		//Equation 2 annual return
		System.out.println("Enter the annual return: ");
		
		//Yearly calculation
		int annualReturn2 = scanner.nextInt();
		
		Savings = (requiredIncome-monthlySSI)
				*((1-(1/(Math.pow(1+(annualReturn/100)/12,yearsRetired*12 )))))/
				((annualReturn/100)/12);
		
		savingsMonthly = Savings *(((annualReturn2/100)/12)/((Math.pow(1+(annualReturn2/100)/12, 
				yearsToWork*12))-1));
		
		System.out.println(Savings);
		System.out.println(savingsMonthly);
		
		System.out.println(" " + yearsRetired + " " + annualReturn + " " + 
		annualReturn2 + " " + requiredIncome + " " + monthlySSI + " " + yearsToWork);
		

		

		

		

		
		

	}

}
