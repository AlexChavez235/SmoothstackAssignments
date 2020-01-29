package assignment2;

public class TestShapes {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 5);
		r.display();
		
		Circle c = new Circle(10);
		c.display();
		
		Triangle t = new Triangle(10, 5);
		t.display();
	}

}
