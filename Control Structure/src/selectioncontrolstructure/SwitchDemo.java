package selectioncontrolstructure;

import java.util.Scanner;

/**
 * 
 * @author SANJAY
 *
 *
 */
public class SwitchDemo {
	int num;
	Scanner input = new Scanner(System.in);

	public void demo() {
		System.out.println("Enter Any Byte Number");
		num = input.nextByte();
	}

	public void test() {
		switch (num) {
		case 1:
			System.out.println("Sanjay Kumar Das");
			break;
		case 2:
			System.out.println("Sujay Kumar Das");
			break;
		case 3:
			System.out.println("Omm Prakash Das");
			break;

		case 4:
			System.out.println("First Year");
			System.out.println("Second Year");
			System.out.println("Third Year");

		default:
			System.out.println("Bye...");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwitchDemo ob = new SwitchDemo();
		ob.demo();
		ob.test();
	}
}
