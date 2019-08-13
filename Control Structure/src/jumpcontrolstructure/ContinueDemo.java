package jumpcontrolstructure;

import java.util.Scanner;

/**
 * Date-12/08/2019
 * 
 * Use Of Continue In Jumping Control Structure
 * 
 * Continue will leave the Current execution of Loop
 * 
 * It Only Use With in Loop
 * 
 * @author SANJAY
 *
 */
public class ContinueDemo {
	int number, i;
	Scanner input = new Scanner(System.in);

	public void input() {

		System.out.println("Enter The Number");
		number = input.nextInt();
	}

	public void operationOnLoop() {
		for (i = 0; i < 5; i++) {
			if (i == number) {
				continue;
			}
			System.out.println(i);
		}
	}

	public void display() {
		System.out.println("Out Put Is:");
		System.out.println(i);
	}

	public static void main(String[] args) {
		ContinueDemo ob = new ContinueDemo();
		ob.input();
		ob.operationOnLoop();
		ob.display();
	}
}
