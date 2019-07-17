package primitivedatatype;

/**
 * @author SANJAY
 *
 */
public class IntDataType {
	public void size() {
		System.out.println("Size Of Integer Data Type");
		System.out.println(Integer.SIZE);
	}

	public void range() {
		System.out.println("Range Of The  Data Type");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}

	public void test() {
		double a = 50;
		System.out.println(a);
	}

	public void test1() {
       int a=10;
       System.out.println(Integer.toHexString(a));
       System.out.println(Integer.toBinaryString(a));
	}

	public static void main(String[] args) {
		IntDataType ob = new IntDataType();
		ob.size();
		ob.range();
		ob.test();
		ob.test1();
	}
}
