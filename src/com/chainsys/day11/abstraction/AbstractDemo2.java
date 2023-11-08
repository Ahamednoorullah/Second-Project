package com.chainsys.day11.abstraction;
abstract class Shape{
	abstract double CalculateArea();
}

class Circle extends Shape{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}

	@Override
	public double CalculateArea() {
		double areaofCircle = Math.PI*(radius*radius);
		return areaofCircle;
		
	}
	
}

class Triangle extends Shape{
	int base;
	int height;
public Triangle(int base,int height) {
	this.base = base;
	this.height=height;
}
	@Override
	double CalculateArea() {
		double areaofTriangle = 1.0/2*base*height;
		return areaofTriangle;
	}
	
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		Shape circle = new Circle(7);
		Shape triangle = new Triangle(3, 7);
		System.out.println("Area of Circle : "+circle.CalculateArea());
		System.out.println("Area of Triangle : "+triangle.CalculateArea());

	}

}
