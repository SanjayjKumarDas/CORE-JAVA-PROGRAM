package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Write A Program Which will Take Input from CommandLine And If Any Argument is
 * Not Enter Then it Will Show The Message "No Argument is Entered From
 * CommandLine"
 * 
 * @author SANJAY
 *
 */
public class Assignment7 {

	public void input(String args[]) {
		if (args.length >= 1) {
			System.out.println(args[0]);
		} else {
			System.out.println("You have Not Entered Any Argument From commandLine");
		}
	}

	public static void main(String[] args) {
		Assignment7 ob = new Assignment7();
		ob.input(args);
	}
}
