package ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		double x,y;
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		theCalculator = null;
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveArg() {
		assertEquals(15d, (theCalculator.getSum(5, 10)));
		assertEquals(15d, (theCalculator.getSum(10, 5)));
	}

	@Test
	public void testGetSumNegativeArg() {
		assertEquals(5d, (theCalculator.getSum(-5, 10)));
		assertEquals(-5d, (theCalculator.getSum(5, -10)));
		assertEquals(-15d, (theCalculator.getSum(-5, -10)));
	}

	@Test
	public void testGetSumNotIntArg() {
		assertEquals(5.32d, (theCalculator.getSum(-5.02, 10.34)));
		assertEquals(-5.32d, (theCalculator.getSum(5.02, -10.34)));
		assertEquals(-15.164d, (theCalculator.getSum(-5.040, -10.124)));
	}

	@Test
	public void testGetSubtractPositiveArg() {
		assertEquals(-5d, (theCalculator.getSubtract(5, 10)));
		assertEquals(5d, (theCalculator.getSubtract(10, 5)));
	}

	@Test
	public void testGetSubtractNegativeArg() {
		assertEquals(-15d, (theCalculator.getSubtract(-5, 10)));
		assertEquals(15d, (theCalculator.getSubtract(5, -10)));
		assertEquals(5d, (theCalculator.getSubtract(-5, -10)));
	}

	@Test
	public void testGetSubtractNotIntArg() {
		assertEquals(-15.36d, (theCalculator.getSubtract(-5.02, 10.34)));
		assertEquals(5.084d, (theCalculator.getSubtract(-5.040, -10.124)));
	}

	@Test
	public void testGetMultiplyPositiveArg() {
		assertEquals(50d, (theCalculator.getMultiply(5, 10)));
		assertEquals(50d, (theCalculator.getMultiply(10, 5)));
	}

	@Test
	public void testGetMultiplyNegativeArg() {
		assertEquals(-50d, (theCalculator.getMultiply(-5, 10)));
		assertEquals(-50d, (theCalculator.getMultiply(5, -10)));
		assertEquals(50d, (theCalculator.getMultiply(-5, -10)));
	}

	@Test
	public void testGetMultiplyNotIntArg() {
		assertEquals(-10.0902d, (theCalculator.getMultiply(-5.02, 2.01)));
		assertEquals(-51.9068d, (theCalculator.getMultiply(5.02, -10.34)));
		assertEquals(50.4d, (theCalculator.getMultiply(-5.040, -10)));
	}

	@Test
	public void testGetDividePositiveArg() {
		assertEquals(0.5d, (theCalculator.getDivide(5, 10)));
		assertEquals(2d, (theCalculator.getDivide(10, 5)));
	}

	@Test
	public void testGetDivideNegativeArg() {
		assertEquals(-0.5d, (theCalculator.getDivide(-5, 10)));
		assertEquals(-0.5d, (theCalculator.getDivide(5, -10)));
		assertEquals(0.50d, (theCalculator.getDivide(-5, -10)));
	}

	@Test
	public void testGetDivideNotIntArg() {
		assertEquals(-2.49751d, (theCalculator.getDivide(-5.02, 2.01)));
		assertEquals(-0.48549d, (theCalculator.getDivide(5.02, -10.34)));
		assertEquals(0.504d, (theCalculator.getDivide(-5.040, -10)));
	}
	@Test
	public void testGetDivide0() {
		String excptMess = null;
		try {
		theCalculator.getDivide(35, 0);}
		catch (IllegalArgumentException e)
		{	//"Dividing to 0 is not allowed!"
			excptMess = e.getMessage();
		}

		assertEquals("Dividing to 0 is not allowed!", excptMess);
	}

}

