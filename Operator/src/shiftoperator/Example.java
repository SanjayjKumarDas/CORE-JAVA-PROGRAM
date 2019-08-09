package shiftoperator;

import java.util.Scanner;

/**
 * Date-03/08/2019
 * 
 * @author SANJAY
 *
 *         Shift Operator Are (>> ,<<,>>>)
 *
 */
public class Example {
	int a, b, c;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Value");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
	}

	public void operation() {
		System.out.println(Integer.toBinaryString(a >> 10));
	}

	public void operation1() {
		System.out.println(Integer.toBinaryString(b << 10));
	}

	public void operation2() {
		System.out.println(Integer.toBinaryString(c >>> 10));
	}

	public static void main(String[] args) {
		Example ob = new Example();
		ob.input();
		ob.operation();
		ob.operation1();
		ob.operation2();
	}
}
