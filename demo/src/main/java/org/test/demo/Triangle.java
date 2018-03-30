package org.test.demo;

public class Triangle {
	
	String type;
	int height;
	
	
	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void draw()
	{
		System.out.println("Triangle drawn of type " +getType() + " and height " +getHeight());
	}
}
