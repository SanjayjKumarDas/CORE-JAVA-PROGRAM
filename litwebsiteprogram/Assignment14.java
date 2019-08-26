package litwebsiteprogram;

/**
 * Date-14/08/2019
 * 
 * Program To Print equilateral triangle using Star(*)4
 * 
 * @author SANJAY
 *
 */
public class Assignment14 {

//	public void equilateralTriangle() {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
////				print() is used to print the output at same line 
//				System.out.print("*");
//			}
////			println() line is used to print the output in nextline 
//			System.out.println();
//		}
//	}
//
//	public void equilateralTriangle1() {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public void equilateral() {
		int star = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star = star + 2;
		}
	}

	public static void main(String[] args) {
		Assignment14 ob = new Assignment14();
		ob.equilateral();
	}
}
