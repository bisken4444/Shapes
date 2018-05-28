package pkgdefault;

public class MainProgram {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(100,20);
		System.out.println(rec1.area());
		System.out.println(rec1.perimeter());
		
		Shape pent1 = new Pentagon(3);
		
		System.out.println(pent1.area());
	}

}
