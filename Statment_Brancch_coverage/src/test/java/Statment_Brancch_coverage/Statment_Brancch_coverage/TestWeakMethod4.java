package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeakMethod4 {
    
    @Test
    public void testBranch1() {
        // Branch where b < 5 and a < 15
        assertEquals(4, WeakClass.weakMethod4(4, 2));
    }

    @Test
    public void testBranch2() {
        // Branch where !(b < 5 and a < 15), i.e., either b >= 5 or a >= 15
        assertEquals(31, WeakClass.weakMethod4(20, 5));
    }
}
