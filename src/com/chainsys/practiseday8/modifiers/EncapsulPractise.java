package com.chainsys.practiseday8.modifiers;

class Car{
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	public String getCompanyName() {return companyName;}
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	public String getModelName() {return modelName;}
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	
	public int getYear() {return year;}
	public void setYear(int year) {
		this.year=year;
	}
	
	public double getMileage() {return mileage;}
	
}

public class EncapsulPractise {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompanyName("Hyundai");
		car.setModelName("i10");
		car.setYear(2007);
		
		String companyName = car.getCompanyName();
		String modelName = car.getModelName();
		int year = car.getYear();
		double mileage = car.getMileage();
		
		System.out.println("My Car Details");
		System.out.println("Company Name : "+companyName);
		System.out.println("Model Name : "+modelName);
		System.out.println("Year  : "+year);
		System.out.println("Mileage  : "+mileage);
		
		

	}

}
