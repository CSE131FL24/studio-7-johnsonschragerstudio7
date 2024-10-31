package studio7;

public class Rectangle {
	private double x;
	private double y;
	private double halfLengthX;
	private double halfLengthY;
	
	public Rectangle(double x, double y, double halfLengthX, double halfLengthY) {
		this.x = x;
		this.y = y;
		this.halfLengthX = halfLengthX;
		this.halfLengthY = halfLengthY;
	}
	
	public double getArea() {
		return (halfLengthX*halfLengthY)*4;
	}
	public double getPerimeter() {
		return halfLengthX*4 + halfLengthY*4;
	}
	
	public boolean compareArea(Rectangle r1) {
		return r1.getArea() > this.getArea();
	}
	public boolean isSquare() {
		return halfLengthX == halfLengthY;
	}
	
}
