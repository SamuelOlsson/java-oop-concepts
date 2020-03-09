package com.oop.lesson.two;

import java.util.ArrayList;
import java.util.List;

import com.oop.lesson.two.cars.Ford;
import com.oop.lesson.two.cars.IsAutomatic;
import com.oop.lesson.two.cars.IsCustomizable;
import com.oop.lesson.two.cars.IsManual;
import com.oop.lesson.two.cars.Mitsubishi;

public class OOPRunner {

	public static void main(String[] args) {

		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(new Ford());
		vehicleList.add(new Mitsubishi());

		
		
		for(Vehicle vehicle : vehicleList) {
			vehicle.startVehicle();
			
			if(vehicle instanceof IsAutomatic) {
				System.out.println("This vehicle is automatic");
			}
			if(vehicle instanceof IsManual) {
				System.out.println("This Vehicle is manual");
			}
			if(vehicle instanceof IsCustomizable) {
				System.out.println("This Vehicle is customizable");
			}
			
			System.out.println("\n\n");
			
		}
		
		/*
		 * for(int i=0; i<vehicleList.size(); i++) { vehicleList.get(i); }
		 */
		
		
	}

}
