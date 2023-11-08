package com.chainsys.day11.abstraction;
abstract class Subject{
	public Subject() {
		System.out.println("Learning Subject...");
	}
	
	abstract void syllables();
	
	void learn() {
		System.out.println("Preparing Right Now...");
	}
}
class IT extends Subject{

	@Override
	void syllables() {
		System.out.println("C,C++,Java");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Subject s = new IT();
		s.syllables();
		s.learn();

	}

}
