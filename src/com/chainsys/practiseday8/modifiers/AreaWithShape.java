package com.chainsys.practiseday8.modifiers;
class Shape{
	public double calculateArea() {
		return 0;
	}
}
class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
 	
	public double calculateArea() {
		double areaOfCircle = Math.PI*(radius*radius);
		return areaOfCircle;
	}
}

class Rectangular extends Shape{
	private int length;
	private int width;
	public Rectangular(int length,int width) {
		this.length=length;
		this.width=width;
	}
 	
	public double calculateArea() {
		int areaOfRectangle = length*width;
		return areaOfRectangle;
	}
	
}

public class AreaWithShape {

	public static void main(String[] args) {
		Circle circle = new Circle(7);
		System.out.println("Area of circle = "+circle.calculateArea());
		
		Rectangular rectangle = new Rectangular(5, 3);
		System.out.println("Area of Rectangle = "+rectangle.calculateArea());

	}

}
