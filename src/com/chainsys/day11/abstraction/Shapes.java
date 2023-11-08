package com.chainsys.day11.abstraction;

public interface Shapes {

	public double getArea();
}
class Circles implements Shapes{
	int radius;
	public Circles(int radius) {
		this.radius=radius;
	}

	
	@Override
	public double getArea() {
		return Math.PI*(radius*radius);
		
	}
	
	
}
class Rectangles implements Shapes{
	int length;
	int width;
	
	public Rectangles(int l,int w) {
		length=l;
		width=w;
		
	}
	@Override
	public double getArea() {
		return length*width;
		
	}
}

