package litwebsiteprogram;

import java.util.Scanner;

/**
 * Date-14/08/2019
 * 
 * Program For To Print The First Letter Of Your Name
 * 
 * @author SANJAY
 *
 */
public class Assignment13 {
	String name;
	Scanner input = new Scanner(System.in);
	char alphabet;

	public void input() {
		System.out.println("Enter Your Name");
		name = input.nextLine();
		System.out.println(name);
	}

	public void logic() {
		for (int i = 65; i <= 90; i++) {
			alphabet = (char) i;
			System.out.println(alphabet);
//			System.out.println((char) i);
		}
	}

	public void scan() {
		for (int i = 0; i < name.length() - 1; i++) {
			if (alphabet == name.charAt(i)) {
                System.out.println("*");
			}
//			char ch = name.charAt(i);
//			System.out.println(ch);
		}
	}

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Assignment13 ob = new Assignment13();
		ob.input();
		ob.logic();
		ob.scan();
	}
}
