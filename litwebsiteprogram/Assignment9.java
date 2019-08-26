package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Check The Greatest Between Three Number Which will Entered From
 * CommandLine(Convert into Double)
 * 
 * 
 * @author SANJAY
 *
 */
public class Assignment9 {

	public void input(String args[]) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);

		if (a > b && a > c) {
			System.out.println("A is Greater");
		} else if (b > a && b > c) {
			System.out.println("B is Greater");
		} else {
			System.out.println("C is Greater");
		}
	}

	public static void main(String[] args) {
		Assignment9 ob = new Assignment9();
		ob.input(args);
	}
}
