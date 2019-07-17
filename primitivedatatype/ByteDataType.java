package primitivedatatype;

/**
 * Date-17/09/2019
 * 
 * @author SANJAY
 *
 */
public class ByteDataType {

	public void range() {
		System.out.println("Range Of Byte DataType");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}

	public void conversion() {
		System.out.println("Type Conversion Example");
		byte a = 10;
		byte b = 20;
		System.out.println(b);
//		Convert a String to Byte 
		System.out.println(Byte.parseByte("20") + a);
//		String + Something is Concatenation       Convert Byte to String 
	}

	public void size() {
		System.out.println("Size Of ByteDataType");
		System.out.println(Byte.SIZE);

	}

	public static void main(String[] args) {
		ByteDataType ob = new ByteDataType();
		ob.range();
		ob.conversion();
		ob.size();

	}
}
