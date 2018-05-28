package pkgdefault;

public class Triangle extends Shape {

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		
		if (validCheck() == false) {
			throw new IllegalArgumentException("Invalid sides");
		}
	}
	
	public Triangle(double sides) {
		this.sideA = sides;
		this.sideB = sides;
		this.sideC = sides;
		
		if (validCheck() == false) {
			throw new IllegalArgumentException("Invalid sides");
		}
	}

	private boolean validCheck() {
		boolean valid=false;
		if ((this.sideA + this.sideB > this.sideC)&&
				(this.sideB + this.sideC > this.sideA)&&(this.sideA + this.sideC > this.sideB)) {
			valid= true;
		}
		return valid;
	}
	
	public double getAngleA() {
		double angleA = (this.sideB*this.sideB) + (this.sideC*this.sideC) - (this.sideA*this.sideA);
		angleA = angleA/(2*this.sideB*this.sideC);
		angleA = Math.acos(angleA) * (180/Math.PI);
		return angleA;
	}

	public double getAngleB() {
		double angleB = (this.sideA*this.sideA) + (this.sideC*this.sideC) - (this.sideB*this.sideB);
		angleB = angleB/(2*this.sideA*this.sideC);
		angleB = Math.acos(angleB) * (180/Math.PI);
		return angleB;
	}

	public double getAngleC() {
		double angleC = (this.sideA*this.sideA) + (this.sideB*this.sideB) - (this.sideC*this.sideC);
		angleC = angleC/(2*this.sideA*this.sideB);
		angleC = Math.acos(angleC) * (180/Math.PI);
		return angleC;
	}
	
	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double perimeter() {
		return this.sideA + this.sideB + this.sideC;
	}
	
	public double area() {
		double halfP = perimeter()/2;
		return Math.sqrt(halfP*(halfP-this.sideA)*(halfP-this.sideB)*(halfP-this.sideC));
	}

	public double apothem() {
		double apothem = 0;
		if (this.sideC == this.sideB && this.sideB == this.sideA) {
			apothem = (this.sideB/(2*Math.tan(Math.toRadians(180/3)))); 
		}
		return apothem;
	}
}
