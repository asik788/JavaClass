package com.visam.elxr;

public class AutoLoan   {
	protected int LoanSanctioned;

	public void validateCustomer() {
		CustomerDetails cd = new CustomerDetails();
		int age = cd.getAge();
		if (age > 21) {
			System.out.println("\n loan is sanctioned");
		} else {
			System.out.println("Sorry we cannot give the loan");
		}
	}
	public void calculateLoanAmount() {

		CarDetails cd = new CarDetails();
		int cost = cd.getCost();
		AutoLoan al = new AutoLoan();
		al.LoanSanctioned = ((cost * 70) / 100);
		System.out.println("\nThe loan amount we can sanction is " + al.LoanSanctioned);
		// System.out.println("At an interest rate of " + interestRate + "%");
	}



}