package litwebsiteprogram;

import java.util.Scanner;

/**
 * Date-24/08/2019
 * 
 * Program for to take the information of an Person and print
 * 
 * @author SANJAY
 *
 */
public class Assignment17 {
	Scanner input = new Scanner(System.in);
	int age;
	double height;
	int weight;

	public void input() {
		System.out.println("Enter The Person Details");
		System.out.println("Age of the Peerson");
		age = input.nextInt();
		System.out.println("Height of the Person");
		height = input.nextDouble();
		System.out.println("Weight of the Person");
		weight = input.nextInt();
	}

	public void display() {
		System.out.println("so,you'r" + age + "years old," + height + " tall and " + weight + " kg heavy");
	}

	public static void main(String[] args) {
		Assignment17 ob = new Assignment17();
		ob.input();
		ob.display();
	}
}
