package fr.epita.geometry.datamodel;

public class Circle implements Shape{
	private double radius;

	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculatePerimeter() {
		return this.radius * 2 * Math.PI;
	}
	
	
	
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	
}
