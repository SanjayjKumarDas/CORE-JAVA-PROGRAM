package litwebsiteprogram;

/**
 * Date-13/08/2019
 * 
 * Find out Area Of circle Take Radius as Input From CommandLine(Radius must be
 * an Integer type)
 * 
 * @author SANJAY
 *
 */
public class Assignment12 {
	int radius;
	double area;

	public void input(String args[]) {
		radius = Integer.parseInt(args[0]);
	}

	public void areaOfCircle() {
		area = 3.141 * radius * radius;
	}

	public void display() {
		System.out.println("Area Of The Circle " + area);
	}

	public static void main(String[] args) {
		Assignment12 ob = new Assignment12();
		ob.input(args);
		ob.areaOfCircle();
		ob.display();
	}
}
