package arithmaticoperator;

import java.util.Scanner;

/**
 * Date-03/08/2019
 * 
 * @author SANJAY
 *
 *         Some Of The Arithmetic Operator Are (+,-,*,/,%)
 *
 */
public class Example {
	int a, b, c;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number");
		a = input.nextInt();
		b = input.nextInt();
	}

	/**
	 * Addition (+)
	 */
	public void add() {
		c = a + b;
		System.out.println("Addition Of Two Number=" + c);
	}

	/**
	 * Subtraction (-)
	 */
	public void sub() {
		c = a - b;
		System.out.println("Subtraction Of Two Number Is=" + c);
	}

	/**
	 * Multiplication
	 */
	public void mul() {
		c = a * b;
		System.out.println("Multiplication Of Two Number " + c);
	}

	/**
	 * Division
	 */
	public void div() {
		c = a / b;
		System.out.println("Division of Two Number Is=" + c);
	}

	/**
	 * Reminder
	 */
	public void rem() {
		c = a % b;
		System.out.println("Reminder Of Two Number=" + c);
	}

	/**
	 * Doubt-How Can I Print All The Methods Value in Single Method like display()
	 * 
	 * 
	 * 
	 */
	public void display() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		Example ob = new Example();
		ob.input();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		ob.rem();
		ob.display();

	}
}
