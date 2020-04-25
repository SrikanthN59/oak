package ksh.firststep;

public class Main {

	public static void main(String arg[]) {

		// with Object
		Main main = new Main();
		main.byteInfo(); // where are you boss

		// With out object
		integerInfo();
	}

	/**
	 * Interger : <br/>
	 * <b>keyword :</b> int <br/>
	 * <b>Size:</b> 4 bytes (2^31) - -2147483648 to 2147483647 <br/>
	 * <b>Wrapper class : </b> java.lang.Integer <br/>
	 */
	public static void integerInfo() {
		int myMoney = 2147483647 + 2147483647;
		int minValue = Integer.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;

		System.out.println(myMoney);
		System.out.println("Integer min value is " + minValue);
		System.out.println("Integer max value is " + maxValue);
	}

	public void longInfo() {
		long longMinValue = Long.MIN_VALUE;
		long longMaxValue = Long.MAX_VALUE;

		System.out.println("Long min value is " + longMinValue);
		System.out.println("Long max value is " + longMaxValue);

	}

	public void floatInfo() {
		float floatMinValue = Float.MIN_VALUE;
		float floatMaxValue = Float.MAX_VALUE;

		System.out.println("Float min value is " + floatMinValue);
		System.out.println("Float max value is " + floatMaxValue);

	}

	/**
	 * Byte: <br/>
	 * <b>keyword :</b> int <br/>
	 * <b>Size:</b> 4 bytes (2^31) - -2147483648 to 2147483647 <br/>
	 * <b>Wrapper class : </b> java.lang.Integer <br/>
	 */
	public void byteInfo() {
		byte byteMinValue = Byte.MIN_VALUE;
		byte byteMaxValue = Byte.MAX_VALUE;

		System.out.println("Byte min value is " + byteMinValue);
		System.out.println("Byte max value is " + byteMaxValue);

	}

	public void doubleInfo() {
		double doubleMinValue = Double.MIN_VALUE;
		double doubleMaxValue = Double.MAX_VALUE;

		System.out.println("Double min value is " + doubleMinValue);
		System.out.println("Double max value is " + doubleMaxValue);

	}

	public void shortInfo() {
		short shortMinValue = Short.MIN_VALUE;
		short shortMaxValue = Short.MAX_VALUE;

		System.out.println("Short min value is " + shortMinValue);
		System.out.println("Short max value is " + shortMaxValue);

	}
}
