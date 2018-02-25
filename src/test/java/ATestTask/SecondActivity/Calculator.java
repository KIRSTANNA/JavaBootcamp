/**
 * 
 */
package ATestTask.SecondActivity;

/**
 * @author 
 * This Calculator gets two numbers of type "doble" as arguments,
 * and returns the arithmetic operation's result with precision 5 sign after the decimal point.
 * Rounding is needed to prevent  possible errors.
 * All input/output information is shown with precision 3 sign after the decimal point.
 */
public class Calculator {

	static String outForm = "%12.3f";

	public double round(double value, int precision) {
		int scale = (int) Math.pow(10, precision);
		return (double) Math.round(value * scale) / scale;
	}

	public double getSum(double x, double y) {
		double sum = round(x + y,5 );
		System.out.println(String.format(outForm,x) + " + " + String.format(outForm,y) + " = " +
				String.format(outForm,sum));
		return sum;
	}

	public double getSubtract(double x, double y) {
		double diff = 0;
		//if (x > y) {
		diff = round(x - y, 5 );
		//}
		System.out.println(String.format(outForm,x) + " - " + String.format(outForm,y) + " = " +
				String.format(outForm,diff));
		return diff;
	}

	public double getMultiply(double x, double y) {
		double mult = round(x * y, 5 );
		System.out.println(String.format(outForm,x) + " * " + String.format(outForm,y) + " = " +
				String.format(outForm,mult));
		return mult;
	}

	public double getDivide(double x, double y) {
		double div = 0;
		if (y == 0)
		throw new IllegalArgumentException("Dividing to 0 is not allowed!");
		else div = round(x / y, 5 );

		System.out.println(String.format(outForm,x) + " / " + String.format(outForm,y) + " = " +
				String.format(outForm,div));
		return div;
	}

}

