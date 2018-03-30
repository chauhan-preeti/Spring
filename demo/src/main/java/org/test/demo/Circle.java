package org.test.demo;

public class Circle {
	
	int radius;
	
	String type;
	
	public Circle(int radius, String type) {
		super();
		this.radius = radius;
		this.type = type;
	}
	
	public Circle(String type) {
		super();
		this.type = type;
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public String getType() {
		return type;
	}

	public void draw()
	{
		System.out.println("Circle drawn with type " +getType() + " and radius " +getRadius());
	}

	public Circle() {
		super();
	}

}
