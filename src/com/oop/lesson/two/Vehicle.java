package com.oop.lesson.two;

public class Vehicle {

	//Declare variables at top of class
	private String type;
	private String plates;
	private String year;

	public Vehicle (String type) {
		this.type = type;
	}

	public void startVehicle() {
		System.out.println("Calling default vehicle starter for a "+this.type.toLowerCase());
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public String getPlates() {
		return plates;
	}

	public void setPlates(String plates) {
		this.plates = plates;
	}
	
	
	
}
