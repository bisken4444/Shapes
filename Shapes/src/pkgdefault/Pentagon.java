package pkgdefault;

public class Pentagon extends Shape {
	
	private double length;
	
	public Pentagon(double length) {
		this.length = length;
	}

	public double perimeter() {
		return this.length*5;
	}

	public double area() {
		return .5 * perimeter() * apothem();
	}

	public double apothem() {
		return (this.length/(2*Math.tan(Math.toRadians(180/5))));
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	

}
