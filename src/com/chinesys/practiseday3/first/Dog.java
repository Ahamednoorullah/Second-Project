package com.chinesys.practiseday3.first;

public class Dog {
	String dogName;
	int dogAge;
	String dogBreed;
	String dogColor;
	
	
	public Dog(String dogName,int dogAge,String dogBreed,String dogColor){
		this.dogName = dogName;
		this.dogAge=dogAge;
		this.dogBreed=dogBreed;
		this.dogColor=dogColor;
	}
	
	public String getName() {return dogName;}
	public int getAge() {return dogAge;}
	public String getBreed() {return dogBreed;}
	public String getColor() {return dogColor;}
	
	public String toString() {
		return ("Hi My Name is "+this.getName()+"\nMy Breed,Age and Color are "+this.getBreed()+","+getAge()+","+getColor());
	}

	public static void main(String[] args) {
		Dog tuffy = new Dog("tuffy",7,"papillon","White");
		System.out.println(tuffy.toString());

	}

}
