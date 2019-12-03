package fr.epita.geometry.datamodel;

public class Square implements Shape{
	
	private double side;

	
	
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side <= 0) {
			return;
		}
		this.side = side;
	}
	
	public double calculatePerimeter() {
		return this.side * 4;
	}
	
	public double calculateArea() {
		return Math.pow(this.side, 2);
	}
}
