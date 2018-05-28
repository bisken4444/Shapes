package pkgdefault;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void RectangleTestArea() {

		int iWidth = 20;
		int iLength = 20;
		double dArea = 200;
		double dPerimeter = 60;
		
		Rectangle rec1 = new Rectangle(iLength,iWidth);
		
		assertEquals(dArea, rec1.area(),0.01);
		assertEquals(dPerimeter, rec1.perimeter(),0.01);
	}
	
	public void RectangleisSquare() {
		int iWidth = 20;
		int iLength = 20;
		Rectangle rec1 = new Rectangle(iLength,iWidth);
		
		assertFalse(rec1.isSquare());
		
		rec1.setWidth(20);
		
		assertTrue(rec1.isSquare());
	}
}