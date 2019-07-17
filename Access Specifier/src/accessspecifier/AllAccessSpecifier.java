package accessspecifier;

public class AllAccessSpecifier {
      public int a=10;
      protected int b=20;
      int c=30;
      private int d=40;
      public static void main(String[] args) {	 
    	  AllAccessSpecifier ob=new AllAccessSpecifier();
    	  System.out.println("All Access Specifier Use With in The Same Class");
    	  System.out.println(ob.a);
    	  System.out.println(ob.b);
    	  System.out.println(ob.c);
    	  System.out.println(ob.d);
	}
}
