package assignment2;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Rectangle implements Shape, extends JFrame {
	
	public double height;
	public double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return this.height*this.width;
	}
	

	@Override
	public void display() {
		System.out.println("This rectangle has a height of " + this.height + 
				" and a width of " + this.width + " giving it a total area of " + 
				this.calculateArea() + ".");
	
	}

}
