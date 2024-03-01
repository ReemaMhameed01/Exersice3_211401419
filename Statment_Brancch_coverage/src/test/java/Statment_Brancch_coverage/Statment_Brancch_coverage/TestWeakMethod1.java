package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class TestWeakMethod1 {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void TestWeakMethod_1() {
	    	
	         WeakClass.weakMethod1(20,0); //Division by zero
	    }
}
