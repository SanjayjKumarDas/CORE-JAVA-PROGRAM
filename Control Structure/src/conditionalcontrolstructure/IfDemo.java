package conditionalcontrolstructure;

import java.util.Scanner;

/**
 * Date-08/08/2019
 * 
 * Simple if Statement Example
 * 
 * @author SANJAY
 *
 */
public class IfDemo {
	int num;
	Scanner input = new Scanner(System.in);

	public void input() {
		System.out.println("Enter The Number");
		num = input.nextInt();
	}

	public void operation() {
		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is ODD");
		}
	}

	public static void main(String[] args) {
		IfDemo ob = new IfDemo();
		ob.input();
		ob.operation();
	}

}
