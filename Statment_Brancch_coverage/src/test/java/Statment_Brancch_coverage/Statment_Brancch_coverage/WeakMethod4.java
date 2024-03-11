package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4 {

	@Test
	public void testweakmethod_4A() {
		assertEquals(5, WeakClass.weakMethod4(6, 2)); 
		assertEquals(24, WeakClass.weakMethod4(16, 2)); 
		assertEquals(8, WeakClass.weakMethod4(12, 2)); 
		assertEquals(24, WeakClass.weakMethod4(12, 6)); 
	}
}
