package accessspecifier;

public class ExecutionOfAllAcessSpecifier {
	public static void main(String[] args) {
		AllAccessSpecifier obj = new AllAccessSpecifier();
		System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d);   not Access bcz Private 
	}

}
