package primitivedatatype;

/**
 * @author SANJAY
 *
 */
public class ShortDataType {
	public void size() {
		System.out.println("Size Of Short Data Type");
		System.out.println(Short.SIZE);
	}

	public void range() {
		System.out.println("Range Of The  Short Data Type");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
	}

	public void test() {
		short a = 50;
		System.out.println(a);
	}

	public static void main(String[] args) {
		ShortDataType ob = new ShortDataType();
		ob.size();
		ob.range();
		ob.test();
	}
}
