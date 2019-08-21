package allvariabledemonstrate;

/**
 * @author SANJAY
 * 
 *         THere Are 6 type Of Variable -local -static -Non-static -Transient
 *         -Volatile -Final
 * 
 *
 */
public class ExampleOfAllVariable {

	static int a = 10;
	int b = 20;
	final int c = 30;

	/**
	 * Local Variable Demo
	 */
	public void demo() {
		int d = 400;
		System.out.println(d);
	}

	public static void main(String[] args) {
		ExampleOfAllVariable ob = new ExampleOfAllVariable();
		System.out.println(ExampleOfAllVariable.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
//		System.out.println(d);
		ob.demo();

	}
}
