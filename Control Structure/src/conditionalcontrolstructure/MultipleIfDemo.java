package conditionalcontrolstructure;

import java.util.Scanner;

/**
 * Date-09/08/2019
 * 
 * Multiple If Demo
 * 
 * @author SANJAY
 *
 */
public class MultipleIfDemo {
	int mark;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Mark");
		mark = input.nextInt();
		input.close();
	}

	public void operation() {
		if (mark >= 90 && mark < 100) {
			System.out.println("Grade O");
		}
		if (mark >= 80 && mark < 90) {
			System.out.println("Grade E");
		}
		if (mark >= 70 && mark < 80) {
			System.out.println("Grade A");
		}
		if (mark >= 60 && mark < 70) {
			System.out.println("Grade B");
		}
		if (mark >= 50 && mark < 60) {
			System.out.println("Grade C");
		}
		if (mark >= 40 && mark < 50) {
			System.out.println("Grade D");
		}
		if (mark <= 35 && mark < 40) {
			System.out.println("FAIL");
		}
	}

	public static void main(String[] args) {
		MultipleIfDemo object = new MultipleIfDemo();
		object.input();
		object.operation();
	}
}
