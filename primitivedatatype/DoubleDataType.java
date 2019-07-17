package primitivedatatype;

/**
 * @author SANJAY
 *
 */
public class DoubleDataType {
	public void size() {
		System.out.println("Size Of Double Data Type");
		System.out.println(Double.SIZE);
	}

	public void range() {
		System.out.println("Range Of The Double Data Type");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
	}

	public void test() {
		double a = 1.2;
		System.out.println(a);
	}

	public static void main(String[] args) {
		DoubleDataType ob = new DoubleDataType();
		ob.range();
		ob.size();
		ob.test();
	}
}
