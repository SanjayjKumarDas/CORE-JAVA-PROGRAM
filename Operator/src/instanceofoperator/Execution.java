package instanceofoperator;

/**
 * @author SANJAY
 *
 */
public class Execution {
	public static void main(String[] args) {
		InstanceOfOperator ob = new InstanceOfOperator();
		Demo ob1 = new Demo();
		Test ob2 = new Test();
		if ((ob instanceof InstanceOfOperator) == true) {
			System.out.println("InstanceOfOperator is an object of InstanceOfOperator");
		}
		if ((ob1 instanceof Demo) == true) {
			System.out.println("Demo Is An Operator of Demo");
		}
		if ((ob2 instanceof Test) == true) {
			System.out.println("Test Is An Object of Test");
		}
		if ((ob2 instanceof InstanceOfOperator) == true) {
			System.out.println("Test Is An Object of InstanceOfOperator");
		}

	}
}
