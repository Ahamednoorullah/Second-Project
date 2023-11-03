package com.chainsys.practiseday8.modifiers;
import com.chainsys.practiseday6.methods.*;

//default Access Modifiers

// having default access modifiers are accessible only within the same package.
class LearningModifiers {
	void display() {
		System.out.println("Hello World");
	}
}

class LearningModifiersDemo extends PractiseStringClassMethod{

	public static void main(String[] args) {
		PractiseStringClassMethod pr = new PractiseStringClassMethod();
		pr.compareStringMethod();
		
		LearningModifiers learn = new LearningModifiers();
		
		learn.display();
		

	}

}
