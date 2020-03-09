package com.oop.lesson.one;

public class Deer extends Animal implements Vegitarian {

	public void test() {
		System.out.println("I'm a deer");
		isVegiterian();
	}
	
	@Override
	public void isVegiterian() {
		// TODO Auto-generated method stub
		System.out.println("Yes I'm vegiterian");
		likesVeggies();
	}

	@Override
	public void likesVeggies() {
		// TODO Auto-generated method stub
		System.out.println("I do like veggies");
		
	}

	
}
