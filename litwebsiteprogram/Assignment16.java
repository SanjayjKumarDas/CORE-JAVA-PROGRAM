package litwebsiteprogram;

import java.util.Scanner;

/**
 * Date-22/08/2019
 * 
 * Program for to enter the number and print the square of that number
 * 
 * @author SANJAY
 *
 */
public class Assignment16 {
	Scanner input = new Scanner(System.in);
	int number;
	int square = 0;

	public void input() {
		System.out.println("Enter the Number");
		number = input.nextInt();
	}

	public void operation() {
		square = number * number;
	}

	public void display() {
		System.out.println("Number =  " + number + "  Square of Number is  :" + square);
	}

	public static void main(String[] args) {
		Assignment16 obj = new Assignment16();
		obj.input();
		obj.operation();
		obj.display();
	}
}
