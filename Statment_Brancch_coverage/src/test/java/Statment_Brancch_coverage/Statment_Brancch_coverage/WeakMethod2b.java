package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod2b {
	@Test
    public void testweakmethod_2b() {
        assertEquals(9,WeakClass.weakMethod2(14,2)); 
        assertEquals(14, WeakClass.weakMethod2(13,1)); 
        assertEquals(28, WeakClass.weakMethod2(20,2)); 
        assertEquals(25, WeakClass.weakMethod2(12,7)); 


	    }
}
