package conditionalcontrolstructure;

import java.util.Scanner;

/**
 * Date-09/08/2019
 * 
 * Nested IF Else Demo
 * 
 * @author SANJAY
 *
 */
public class NestedIfDemo {
	int mark;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Mark ");
		mark = input.nextInt();
		input.close();
	}

	public void operation() {
		if (mark >= 90) {
			System.out.println("Grade O");
		} else if (mark >= 80) {
			System.out.println("Grade E");
		} else if (mark >= 70) {
			System.out.println("Grade A");
		} else if (mark >= 60) {
			System.out.println("Grade B");
		} else if (mark >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");
		}
	}

	public static void main(String[] args) {
		NestedIfDemo ob = new NestedIfDemo();
		ob.input();
		ob.operation();
	}
}
