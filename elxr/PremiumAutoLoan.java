package com.visam.elxr;

public class PremiumAutoLoan extends AutoLoan {
public void calculateLoanAmount() {
	CarDetails cd = new CarDetails();
	int cost = cd.getCost();
	AutoLoan al = new AutoLoan();
	al.LoanSanctioned = cost;
	System.out.println("\nThe loan amount we can sanction is " + al.LoanSanctioned);
	// System.out.println("At an interest rate of "+interestRate+"%");
	// System.out.println(interestRate);
}
}