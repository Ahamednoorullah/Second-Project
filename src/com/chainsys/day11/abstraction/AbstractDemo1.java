package com.chainsys.day11.abstraction;
abstract class Animal{
	abstract void sound();
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("Cat says : meow meow");
		
	}
	
}

class Goat extends Animal{

	@Override
	void sound() {
		System.out.println("Goat says : mey mey");
		
	}
	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		//Animal animal = new Cat();
		Animal animal = new Goat();
		animal.sound();

	}

}
