package repetationcontrolstructure;

/**
 * Date-12/08/2019
 * 
 * Demonstrate of For Loop
 * 
 * for(initialization condition increment/decrement)
 * 
 * @author SANJAY
 *
 */
public class ForDemo {
	/**
	 * method is used to Demonstrate the For Loop
	 */
	public void demo() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ForDemo ob = new ForDemo();
		ob.demo();
	}
}
