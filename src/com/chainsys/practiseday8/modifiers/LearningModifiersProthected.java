package com.chainsys.practiseday8.modifiers;

import com.chainsys.practiseday6.methods.PractiseStringClassMethod;

class A{
	protected void display() {
		System.out.println("Hello world");
	}
}

public class LearningModifiersProthected extends PractiseStringClassMethod{

	public static void main(String[] args) {
		A a = new A();
		a.display();
		
		LearningModifiers le = new LearningModifiers();
		le.display();
		

	}

}
