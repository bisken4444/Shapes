package pkgdefault;

public class Rectangle extends Shape {
	
	private int len;
	private int Width;
	
	public Rectangle(int length, int width) {
		super();
		len = length;
		Width = width;
	}
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public double area() {
		return (double) len * Width;
	}
	
	public double perimeter() {
		return (double) (2 * len) + (2 * Width);
	}
	
	public boolean isSquare() {
		if (Width == len) {
			return true;
		} else {
			return false;
		}
	}

	public double apothem() {
		double apothem = 0;
		if (isSquare()) {
			apothem = (this.len/(2*Math.tan(Math.toRadians(180/4))));
		}
		return apothem;
	}
	
}
