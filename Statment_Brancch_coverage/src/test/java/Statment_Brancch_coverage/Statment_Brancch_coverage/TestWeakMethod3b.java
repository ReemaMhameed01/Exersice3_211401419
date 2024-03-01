package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod3b {
	@Test(expected=java.lang.ArithmeticException.class)
	public void TestWeakMethod_3b() {

		WeakClass.weakMethod3b(12,0); // Division by zero should throw ArithmeticException
	}
	@Test
	public void testCase1() {
		// Test when a < 5
		assertEquals(8, WeakClass.weakMethod3b(4, 2));
	}

	@Test
	public void testCase2() {
		// Test when a >= 5
		assertEquals(7, WeakClass.weakMethod3b(3, 2));
	}
}