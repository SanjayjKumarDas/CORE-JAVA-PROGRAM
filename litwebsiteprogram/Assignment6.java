package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Exchange Of two Integer type Values Without Using Third Variable
 * 
 * @author SANJAY
 *
 */
public class Assignment6 {
	int a = 10;
	int b = 20;

	public void logic() {
		a = a + b;
		b = a - b;
		a = a - b;
	}

	public void display() {
		System.out.println("Value of a=" + a);
		System.out.println("Value of b=" + b);
	}

	public static void main(String[] args) {
		Assignment6 ob = new Assignment6();
		ob.logic();
		ob.display();
	}
}
