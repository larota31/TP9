package co.simplon.shapes;

public class Circle extends Shape {
	private double rayon;

	public Circle(double y, double x, double rayon) {
		super(y, x);
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Circle [rayon=" + rayon + "]"+super.toString();
	}
public double area() {
	return math.PI*rayon*rayon;
}
	
	

}
