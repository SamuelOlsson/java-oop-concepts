package com.oop.lesson.two.cars;

import com.oop.lesson.two.Vehicle;

public class Mitsubishi extends Vehicle implements IsManual {

	public Mitsubishi() {
		super("MITSUBISHI");
	}
	
	public void startVehicle() {
		System.out.println("Hi I'm Mitsubishi and I have my own custom starter!");
		super.startVehicle();
	}
	
	
	
}
