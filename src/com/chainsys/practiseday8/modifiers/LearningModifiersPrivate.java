package com.chainsys.practiseday8.modifiers;
// Private Access Modifiers Oru class iruntha Athu classs kulla mattum thaan use panna mudiyum
class LearningModifiers1{
	private void display() {
		System.out.println("Hello world");
	}
}


class LearningModifiersPrivate {

	public static void main(String[] args) {
		LearningModifiers1 demo =new LearningModifiers1();
           demo.display();// ippudi call panna mudiyathu private irukurathunala
	}

}
