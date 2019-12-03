package fr.epita.geometry.datamodel;

public class Triangle implements Shape {
	private double sideA;
	private double sideB;
	private double base;
	private double height;


	
	public Triangle(double sideA, double sideB, double base, double height) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.base = base;
		this.height = height;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculatePerimeter() {
		return this.base + this.sideA + this.sideB;
	}
	
	public double calculateArea() {
		return this.base * this.height / 2;
	}

}
