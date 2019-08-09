package unaryoperator;

import java.util.Scanner;

/**
 * Date-30/07/2019
 * 
 * @author SANJAY
 * 
 *         Some Of The Unary Operator Are (+,-,++,--,!,~)
 *
 */
public class Example {
	int x;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number ");
		x = input.nextInt();
	}

	public void display() {
		int y = x++ + ++x + x++;
		System.out.println(y);
		System.out.println(x);
	}

	public static void main(String[] args) {
		Example ob = new Example();
		ob.input();
		ob.display();
	}
}
