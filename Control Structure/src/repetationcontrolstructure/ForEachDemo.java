package repetationcontrolstructure;

/**
 * Date-12/08/2019
 * 
 * Demonstrate of ForEach Loop
 * 
 * 
 * 
 * 
 * @author SANJAY
 *
 */
public class ForEachDemo {
	/**
	 * Test
	 */
	public void test() {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int i : arr) {
			System.out.println(i);
		}
	}

//	public void test1() {
//		String name = "Sanjay";
//		for (String find : name) {
//			System.out.println(find);
//		}
//	}

	public static void main(String[] args) {
		ForEachDemo ob = new ForEachDemo();
		ob.test();
	}
}
