package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * @author SANJAY
 *
 */
public class Assignment10 {
	short a;

	public void input(String args[]) {
		a = Short.parseShort(args[0]);
	}

	public void evenOrOddNumberCheck() {
		if (a % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number Is Odd");
		}
	}

	public static void main(String[] args) {
		Assignment10 ob = new Assignment10();
		ob.input(args);
		ob.evenOrOddNumberCheck();
	}
}
