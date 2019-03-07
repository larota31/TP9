package co.simplon.shapes;

public  abstract class Shape {
	private double y;
	private double x;
	public Shape(double y, double x) {
		this.y = y;
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Shape [y=" + y + ", x=" + x + "]";
	}
	public abstract double area() {
		
	}
	
	


}
