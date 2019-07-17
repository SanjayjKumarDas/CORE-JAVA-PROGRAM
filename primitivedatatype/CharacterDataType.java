package primitivedatatype;

/**
 * Date-17/07/2019
 * 
 * @author SANJAY
 *
 */
public class CharacterDataType {
	public void range() {
		System.out.println("Range Of Character Data Type");
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
	}

	public void size() {
		System.out.println("Size of The Character Data Type");
		System.out.println(Character.SIZE);
	}

	public void test() {
		System.out.println("Printing Capital Letter");
		for (int i = 65; i <= 90; i++) {
			System.out.println((char) i);
		}
	}

	public void test1() {
		int digit = 0, upper = 0, lower = 0;
		String s = "Yes Java Is Best 12.01";
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				digit++;
			}
			if (Character.isUpperCase(ch)) {
				upper++;
			}
			if (Character.isLowerCase(ch)) {
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
	}

	public static void main(String[] args) {
		CharacterDataType ob = new CharacterDataType();
		ob.range();
		ob.size();
		ob.test();
		ob.test1();
	}
}
