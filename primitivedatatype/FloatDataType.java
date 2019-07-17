package primitivedatatype;

/**
 * @author SANJAY
 *
 */
public class FloatDataType {
	public void size() {
		System.out.println("Size Of Float Data Type");
		System.out.println(Float.SIZE);
	}

	public void range() {
		System.out.println("Range Of The Float Data Type");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
	}

	public void test() {
		double a = 1.2f;
		System.out.println(a);
	}

	public void test1() {
		float a = 1.5f;
		double b = 1.5;
//		a=1.2f; b=1.2;    o/p-false
		System.out.println(a == b);
	}

	public static void main(String[] args) {
		FloatDataType ob = new FloatDataType();
		ob.size();
		ob.range();
		ob.test();
		ob.test1();
	}
}
