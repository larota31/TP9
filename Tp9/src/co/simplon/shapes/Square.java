package co.simplon.shapes;

public class Square  extends Shape{
	public double side;

	public Square(double y, double x, double side) {
		super(y, x);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", getY()=" + getY() + ", getX()=" + getX() + ", toString()=" + super.toString()
				;
	}
	public double area() {
		return side*side;
	}

	

}
