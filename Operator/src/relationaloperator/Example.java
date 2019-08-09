package relationaloperator;

import java.util.Scanner;

/**
 * @author SANJAY
 * 
 *         Relational Operator Are (>,>=,<,<=,==,!=)
 *
 */
public class Example {
	int a, b;

	public void input() {
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
	}

	public void operation() {
		System.out.println(a == b);
	}

	public void operation1() {
		System.out.println(a >= b);
	}

	public void operation2() {
		System.out.println(a <= b);
	}

	public static void main(String[] args) {
		Example ob = new Example();
		ob.input();
		ob.operation();
		ob.operation1();
		ob.operation2();
	}
}
