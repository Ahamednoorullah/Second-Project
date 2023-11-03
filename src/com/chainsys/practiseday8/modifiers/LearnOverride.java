package com.chainsys.practiseday8.modifiers;
//Method Overriding
class Animal{
	void eat() {
		System.out.println("Animal is Eating");
	}
	void walk() {
		System.out.println("Animal is Walking");
	}
}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat is Eating");
	}
	void walk() {
		System.out.println("Cat is Walking");
	}
	}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog is Eating");
	}
	void walk() {
		System.out.println("Dog is Walking");
	}
	
}
public class LearnOverride {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.eat();

	}

}
