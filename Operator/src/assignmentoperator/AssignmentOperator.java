package assignmentoperator;

import java.util.Scanner;

/**
 * Date-03/08/2019
 * 
 * @author SANJAY
 * 
 *         Some Of Assignment Operator Are
 *         (=,+=,-=,*=,/=,%=,<<=,>>=,>>>=,&=,^=,|=)
 *
 */
public class AssignmentOperator {
	int a, b, res;

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number");
		a = input.nextInt();
		b = input.nextInt();
//		input.close();
	}

	public void assign() {
		res = a + b;
		System.out.println(res);
	}

	public void operation1() {
		res -= a;
		System.out.println(res);
	}

	public void operation2() {
		res *= b;
		System.out.println(res);
	}

	public void operation3() {
		res /= a;
		System.out.println(res);
	}

	public void operation4() {
		res %= b;
		System.out.println(res);
	}

	public void operation5() {
		res >>= a;
		System.out.println(res);
	}

	public static void main(String[] args) {
		AssignmentOperator ob = new AssignmentOperator();
		ob.input();
		ob.assign();
		ob.operation1();
		ob.operation2();
		ob.operation3();
		ob.operation4();
		ob.operation5();
	}
}
