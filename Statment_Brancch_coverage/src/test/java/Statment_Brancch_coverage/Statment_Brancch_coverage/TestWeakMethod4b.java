package Statment_Brancch_coverage.Statment_Brancch_coverage;


import org.junit.Test;

public class TestWeakMethod4b {
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        // Testing the division by zero scenario
        WeakClass.weakMethod4b(10,0);
    }
}
