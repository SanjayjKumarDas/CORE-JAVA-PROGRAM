package primitivedatatype;

/**
 * Date-17/07/2019
 * 
 * @author SANJAY
 *
 */
public class BooleanDataType {
	/**
	 * @param args
	 */

	public void demo() {
		boolean b1, b;

		b1 = false;
		System.out.println("b1 is " + b1);
		b1 = true;
		System.out.println("b1 is " + b1);

		// a boolean value can control the if statement
		if (b1)
			System.out.println("This is executed.");

		b = false;
		if (b)
			System.out.println("Not executed.");

		// outcome of relational operator is a boolean
		System.out.println("100 > 90 is " + (100 > 90));
	}

	public void demo1() {
		boolean b1, b2, b3;

		b1 = true; // Assigning Value
		b2 = false; // Assigning Value
		b3 = b2; // Assigning Variable

		System.out.println(b1); // Printing Value
		System.out.println(b2); // Printing Value
		System.out.println(b3); // Printing Value
	}

	public static void main(String[] args) {
		BooleanDataType ob = new BooleanDataType();
		ob.demo();
		ob.demo1();
	}
}
