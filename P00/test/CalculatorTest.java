import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator ();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(actual, expected);
	}
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator ();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public final void testmultiply() {
		//fail("Not yet implemented");
		int a = 12;
		int b = 10;
		
		Calculator cal = new Calculator ();
		int actual = cal.multiply(a, b);
		
		int expected = 120;
		assertEquals(actual, expected);
	}
	@Test
	public final void testdivide() {
		//fail("Not yet implemented");
		int a = 1000;
		int b = 10;
		
		Calculator cal = new Calculator ();
		int actual = cal.divide(a, b);
		
		int expected = 100;
		assertEquals(actual, expected);
	}
}
