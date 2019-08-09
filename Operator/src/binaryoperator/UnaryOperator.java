package binaryoperator;

/**
 * @author SANJAY
 *
 */
public class UnaryOperator {
	public void demo() {
		int x = 4;
		int y;
		y = ++x + ++x + x++ + x++ + --x;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		UnaryOperator ob = new UnaryOperator();
		ob.demo();
	}

}
