package primitivedatatype;

/**
 * @author SANJAY
 *
 */
public class LongDataType {
	public void size() {
		System.out.println("Size Of Long Data Type");
		System.out.println(Long.SIZE);
	}

	public void range() {
		System.out.println("Range Of The  Data Type");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

	public void test() {
		double a = 50;
		System.out.println(a);
	}

	public void test1() {
		int a = 10;
		System.out.println(Long.toHexString(a));
		System.out.println(Long.toBinaryString(a));
	}

	public static void main(String[] args) {
		LongDataType ob = new LongDataType();
		ob.size();
		ob.range();
		ob.test();
		ob.test1();
	}
}
