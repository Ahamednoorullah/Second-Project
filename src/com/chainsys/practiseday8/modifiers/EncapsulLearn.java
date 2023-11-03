package com.chainsys.practiseday8.modifiers;
class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {return age;}
	
	public void setAge(int age) {
		this.age= age;
	}
}

public class EncapsulLearn {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("John");
		person.setAge(25);
		
		System.out.println("A person name is "+person.getName()+" and age is "+person.getAge());

	}

}
