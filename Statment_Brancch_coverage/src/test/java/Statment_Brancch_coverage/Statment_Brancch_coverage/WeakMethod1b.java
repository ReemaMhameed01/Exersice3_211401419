package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod1b {

    @Test
    public void testweakmethod_1b() {
		assertEquals(5, WeakClass.weakMethod1(5,5));
		assertEquals(12, WeakClass.weakMethod1(12,12));

		
		
	}

}
