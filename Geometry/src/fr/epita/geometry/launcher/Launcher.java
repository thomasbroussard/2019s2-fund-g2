package fr.epita.geometry.launcher;

import java.util.Arrays;
import java.util.List;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

public class Launcher {

	public static void main(String[] args) {
		Shape t1 = new Triangle(1, 2, 3, 1.5);
		Shape t2 = new Triangle(2, 1, 3, 1.5);
		
		Shape c1 = new Circle(20);
		Shape c2 = new Circle(30);
		
		Shape s1 = new Square(4);
		Shape s2 = new Square(5);
		
		List<Shape> shapes = Arrays.asList(t1,t2,c1,c2,s1,s2);
		double perimeter = 0;
		double area = 0;
		for (Shape shape : shapes) {
			perimeter += shape.calculatePerimeter();
			area += shape.calculateArea();
		}

		
		System.out.println(perimeter);
		System.out.println(area);

		
	}

}
