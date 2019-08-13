package conditionalcontrolstructure;

import java.util.Scanner;

/**
 * Date-09/08/2019
 * 
 * Simple If Else Statement Example{
 * 
 * 
 * @author SANJAY
 *
 */
public class IfElseDemo {
	int mark;
	String ch;
	Scanner input = new Scanner(System.in);

	public void input() {
		System.out.println("Enter The Student Mark");
		mark = input.nextInt();
	}

	public void logic() {
		if (mark >= 35) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

	public static void main(String[] args) {
		IfElseDemo ob = new IfElseDemo();
		ob.input();
		ob.logic();
	}
}
