package commandlineexample;

public class CommandLineExample {
	public static void main(String[] args) {
		System.out.println("Length of CommandLine Argument is " + args.length);
		System.out.println("First Argument is " + args[0]);
		System.out.println("Second Argument is " + args[1]);
		System.out.println("Third Argument is " + args[2]);
		System.out.println("Contents of CommandLine Argument Are:");
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
