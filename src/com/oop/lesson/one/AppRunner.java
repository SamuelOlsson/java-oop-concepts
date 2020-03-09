package com.oop.lesson.one;

public class AppRunner {

	public static void main(String[] args) {

		Deer deer = new Deer();
		Dog dog = new Dog();
		System.out.println("---- Run Test deer----");
		runTestMethod(deer);
		runTestMethod(dog);
		
	}
	
	public static void runTestMethod(Animal animal) {
		animal.test();
	}

}
