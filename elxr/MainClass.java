package com.visam.elxr;

public class MainClass {

	public static void main(String[] args) {

		CustomerDetails cd = new CustomerDetails();
		CarDetails cds = new CarDetails();
		AutoLoan al = new AutoLoan();
		cd.setName("Sai");
		cd.setAge(23);
		cd.setSsn("wasd");
		cd.setAccountNumber(12467);

		System.out.println("\nAutoLoan ");

		// printing customer and car details
		cd.displayCustomerDetails();
		cds.displayCarDetails();
         al.validateCustomer();
		// TODO Auto-generated method stub
	}

}