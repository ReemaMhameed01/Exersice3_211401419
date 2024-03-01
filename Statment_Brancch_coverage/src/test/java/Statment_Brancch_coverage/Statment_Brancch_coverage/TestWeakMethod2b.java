package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod2b {
	@Test
    public void testweakmethod_2b() {
        assertEquals(9,WeakClass.weakMethod2b(14,2)); 
        assertEquals(14, WeakClass.weakMethod2b(13,1)); 
        assertEquals(28, WeakClass.weakMethod2b(20,2)); 
        assertEquals(25, WeakClass.weakMethod2b(12,7)); 


	    }
}
