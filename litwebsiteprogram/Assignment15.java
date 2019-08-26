package litwebsiteprogram;

import java.util.Scanner;

/**
 * Date-20/08/2019
 * 
 * 
 * Program for to find the Largest between Three Number using Ternary
 * Operator(Also Call As Conditional Operator)
 * 
 * @author SANJAY
 *
 */
public class Assignment15 {
	Scanner input = new Scanner(System.in);

	int a, b, c, d;

	public void input() {
		System.out.println("Enter the Values For A");
		a = input.nextInt();
		System.out.println("Enter the Value for B");
		b = input.nextInt();
		System.out.println("Enter the value for C");
		c = input.nextInt();
	}

	public void largestNumber() {
		d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("Largest Number:" + d);
	}

	public static void main(String[] args) {
		Assignment15 ob = new Assignment15();
		ob.input();
		ob.largestNumber();
	}
}
