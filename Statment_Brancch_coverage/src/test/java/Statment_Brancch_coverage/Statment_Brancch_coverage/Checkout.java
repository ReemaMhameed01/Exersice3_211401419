package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Checkout {
	@Test
	public void testcheckOut1() {
		double cart=2500;
		int creditRating=10;
		String statuts = "gold";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);
		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut2() {
		double cart=2000;
		int creditRating=10;
		String statuts = "silver";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}@Test
	public void testcheckOut3() {
		double cart=4000;
		int creditRating=700;
		String statuts = "gold";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testcheckOut4() {
		double cart=3800;
		int creditRating=649;
		String statuts = "gold";
		boolean expectedResult=false;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut5() {
		double cart=1400;
		int creditRating=10;
		String statuts = "diamond";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut6() {
		double cart=1700;
		int creditRating=900;
		String statuts = "diamond";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut7() {
		double cart=1830;
		int creditRating=300;
		String statuts = "diamond";
		boolean expectedResult=false;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut8() {
		double cart=1120;
		int creditRating=199;
		String statuts = "silver";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testcheckOut9() {
		double cart=4000;
		int creditRating=2019;
		String statuts = "silver";
		boolean expectedResult=true;
		boolean result = Exesice3_Ques5Checkout.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
}
