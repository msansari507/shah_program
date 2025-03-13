// Assignment 51 WAP on Interface with two Abstract methods
package package003;

interface Circle{
	void draw(); // by default methods under interface are abstract and public in nature
	void area();
}

public class Shape implements Circle {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		s.area();
		
	}

	public void draw() {
		System.out.println("Draw a circle of 5cm radius");		
	}

	public void area() {
		int r = 5;
		double ar = 3.14*r*r;
		System.out.println("Area of the circle is : "+ar + "cm2");
		
	}

}
