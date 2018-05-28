package pkgdefault;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void TriangleTestArea() {

		
		Triangle tri1 = new Triangle(5,5,9);
		
		System.out.println(tri1.area());
	}

}
