package conditionaloperator;

/**
 * @author SANJAY
 * 
 *         Conditional Operator is ?:
 *
 */
public class Example {
	boolean result = true;

	public void operation() {
		String mood = result == true ? "U'r Happy" : "U'r Sad";
		System.out.println(mood);
	}

	public static void main(String[] args) {
		Example ob = new Example();
		ob.operation();
	}
}
