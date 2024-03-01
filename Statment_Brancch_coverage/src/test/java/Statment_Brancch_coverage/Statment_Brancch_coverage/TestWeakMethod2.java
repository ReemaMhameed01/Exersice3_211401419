package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class TestWeakMethod2 {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void TestWeakMethod_2() {
	    	
	         WeakClass.weakMethod2(12,0); //Division by zero
	    }
}
