package jumpcontrolstructure;

import java.util.Scanner;

/**
 * Date-12/08/2019
 * 
 * ALWAYS DEBUG THE CODE
 * 
 * Demonstrate of Break In Jumping Control Structure
 * 
 * Break Only Placed with in Loop And Switch
 * 
 * If We Use Break In Our Code It Take The Execution of Code To Out Of The Loop
 * 
 * @author SANJAY
 *
 */
public class BreakDemo {
	int num, i;
	Scanner input = new Scanner(System.in);

	/**
	 * Method to Take Input From User
	 */
	public void input() {

		System.out.println("Enter The Number");
		num = input.nextInt();
	}

	/**
	 * Method to Do Operation What You Want to Do
	 */
	public void operatonDemoOnLoop() {
		for (i = 1; i < num; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

	public void operationDemoOnSwitch() {
		switch (num) {
		case 1:
			System.out.println("You Enter The Unit Digit");
			break;
		case 10:
			System.out.println("You Enter The 10 Digit");
			break;
		default:
			System.out.println("Sorry You Enter The Wrong Numbers :");
		}
	}

	/**
	 * This Method is used to Display the Output
	 */
	public void display() {
		System.out.println("Out Put Is:");
		System.out.println(i);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BreakDemo ob = new BreakDemo();
		ob.input();
		ob.operatonDemoOnLoop();
		ob.display();
		ob.operationDemoOnSwitch();

	}
}
