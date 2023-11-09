package com.chainsys.day12.inheritence;

//Hierarchical Inheritance........
abstract class Vehicle{
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double fuelEfficiency;
	public Vehicle(String make,String model,int year,String fuelType,double fuelEffiency) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.fuelType=fuelType;
		this.fuelEfficiency=fuelEffiency;
	}
	
	public String getMake() {return make;}
	public String getModel() {return model;}
	public int getYear() {return year;}
	public String getFuelType() {return fuelType;}
	public double getFuelEfficiency() {return fuelEfficiency;}
	
	abstract public double calculateFuelEfficiency();
	
	abstract public double distanceTravelled(); 
	
	abstract public double getMaxSpeed();
	
}

class Car extends Vehicle{
	private int numOfSeat;
	public Car(String make,String model,int year,String fuelType,double fuelEffiency,int numOfSeat) {
		super(make, model, year, fuelType, fuelEffiency);
		this.numOfSeat= numOfSeat;
	}
	
	public int getNumOfSeat() {return numOfSeat;}

	@Override
	public double calculateFuelEfficiency() {
		
		return getFuelEfficiency()*(1.0/(1.0+numOfSeat/5.0));
	}

	@Override
	public double distanceTravelled() {
		
		return getFuelEfficiency()*calculateFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		
		return 120.0;
	}
	
	public void displayInfo() {
		System.out.println("Car Company Name :"+getMake());
		System.out.println("Car Model :"+getModel());
		System.out.println("Fuel Effieciency :"+calculateFuelEfficiency()+"mpg");
		System.out.println("Distance Travelled :"+distanceTravelled()+" miles");
		System.out.println("Max Speed :"+getMaxSpeed()+" mph\n");
	}
}

class Truck extends Vehicle{
	private double cargoCapacity;
	
	public Truck(String make,String model,int year,String fuelType,double fuelEffiency,double cargoCapacity) {
		super(make, model, year, fuelType, fuelEffiency);
		this.cargoCapacity =  cargoCapacity;
	}
	
	public double cargoCapacity() {return cargoCapacity;}

	@Override
	public double calculateFuelEfficiency() {
		
		return getFuelEfficiency() * (1.0 /(1.0 + cargoCapacity/1000.0));
	}

	@Override
	public double distanceTravelled() {
		
		return getFuelEfficiency()*calculateFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		
		return 80.0;
	}
	
	public void displayInfo() {
		System.out.println("Truck Company Name :"+getMake());
		System.out.println("Truck Model :"+getModel());
		System.out.println("Fuel Effieciency :"+calculateFuelEfficiency()+"mpg");
		System.out.println("Distance Travelled :"+distanceTravelled()+" miles");
		System.out.println("Max Speed :"+getMaxSpeed()+" mph\n");

	}
	
}

public class InheritenceDemo {

	public static void main(String[] args) {
		Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
		Car car = new Car("Hyundai", "i10", 2007, "Petrol", 16.95, 5);

		car.displayInfo();
		System.out.println("----------------------------------");
		truck.displayInfo();
	}

}
