package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Add All The Argument Which will Entered From CommandLine
 * 
 * @author SANJAY
 *
 */
public class Assignment8 {
	public void input(String args[]) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[0]);
		}
	}

	public void sumOfAllCommandlineValue(String args[]) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment8 ob = new Assignment8();
		ob.input(args);
		ob.sumOfAllCommandlineValue(args);
	}
}
