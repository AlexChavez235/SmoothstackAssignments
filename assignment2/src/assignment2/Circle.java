package assignment2;
import java.lang.Math;

public class Circle implements Shape {
	
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public void display() {
		System.out.println("This circle has a radius of " + this.radius + 
				" giving it a total area of " + this.calculateArea() + ".");
	}

}
