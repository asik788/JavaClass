package com.visam.elxr;

public class CustomerDetails {
	private String Ssn;
	private String name;
	private int age;
	private int accountNumber;

	public String getSsn() {
		return Ssn;
	}

	public void setSsn(String ssn) {
		Ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void displayCustomerDetails() {

		System.out.println(
				"\nCustomer details:" + name + "\t" + age + "\t"  + "\t" + Ssn + "\t" + accountNumber);
		// to do: use of multidimensional array for storing many customer details

	}
}