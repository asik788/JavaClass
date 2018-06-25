package com.visam.elxr;

public class CarDetails {

	private String manufacturer;
	private String model;
	private String makeyear;
	private String cost;

	public CarDetails() {
		this.manufacturer = "Ford";
		this.model = "Mustang GT";
		this.makeyear = "2018";
		this.cost = "40000";

	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getMakeyear() {
		return makeyear;
	}

	public int getCost() {
		return Integer.parseInt(cost);
	}

	public void displayCarDetails() {

		System.out.println("\ncar details: " + manufacturer + "\t" + model + "\t" + makeyear + "\t" + cost);
	}

}