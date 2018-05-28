package pkgdefault;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PentagonTest {

	
	void PentagonTestArea() {
		
		Shape pent1 = new Pentagon(5);
		
		System.out.println(pent1.area());
	}

}
