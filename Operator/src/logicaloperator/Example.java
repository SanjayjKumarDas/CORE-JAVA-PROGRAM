package logicaloperator;

/**
 * Date-03/08/2019
 * 
 * @author SANJAY
 *
 */
public class Example {
	public void test() {
		int x = 5, y = 10;
		boolean z = (x++ > 4) && (y++ > 10);
		System.out.println(x + "\t" + y + "\t" + z);
	}

	public static void main(String[] args) {
		Example ob = new Example();
		ob.test();
	}
}
