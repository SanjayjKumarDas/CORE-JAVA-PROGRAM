package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Exchange the Value Of Two Variable Using Third Variable
 * 
 * @author SANJAY
 *
 */
public class Assignment5 {
	int a = 10;
	int b = 20;
	int c;

	public void logic() {
		c = a;
		a = b;
		b = c;
	}

	public void display() {
		System.out.println("Value Of a and b After Exchange:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void main(String[] args) {
		Assignment5 ob = new Assignment5();
		ob.logic();
		ob.display();
	}
}
