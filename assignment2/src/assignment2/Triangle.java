package assignment2;

public class Triangle implements Shape {
	
	public double base;
	public double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return (this.base*this.height)/2;
	}

	@Override
	public void display() {
		System.out.println("This triangle has a base of " + this.base + 
				" and a height of " + this.height + 
				" giving it a total area of " + this.calculateArea() + ".");

	}

}
