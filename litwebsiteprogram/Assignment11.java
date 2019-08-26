package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Without Using Data type Find Out Factorial Of A Number, Enter the Number from
 * commandLine
 * 
 * @author SANJAY
 *
 */
public class Assignment11 {
	Integer a, fact = 1, i;

	public void input(String args[]) {
		a = Integer.parseInt(args[0]);
	}

	public void logic() {

		for (i = 1; i <= a; i++) {
			fact = fact * i;
		}
	}

	public void display() {
		System.out.println("Factorial Of Number is" + fact);
	}

	public static void main(String[] args) {
		Assignment11 ob = new Assignment11();
		ob.input(args);
		ob.logic();
		ob.display();
	}
}
