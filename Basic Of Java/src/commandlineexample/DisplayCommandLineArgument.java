package commandlineexample;

/**
 * Date-16/07/2019
 * 
 * @author SANJAY
 *
 */
public class DisplayCommandLineArgument {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args.length);
		if (args.length > 0) {
			System.out.println("Display All The Argument");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("Argument is not Present");
		}
	}
}
