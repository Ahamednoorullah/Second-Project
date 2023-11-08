package com.chainsys.day11.abstraction;

public class InterfaceDemo {

	public static void main(String[] args) {
		Shapes circle = new Circles(5);
		System.out.println("Area of Circle : "+circle.getArea());

		Shapes rectangle = new Rectangles(5, 6);
		System.out.println("Area of Rectangle : "+rectangle.getArea());
	}

}
