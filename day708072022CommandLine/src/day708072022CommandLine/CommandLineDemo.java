package day708072022CommandLine;

public class CommandLineDemo {

	public static void main(String[] args) {
	System.out.println(args[0]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	//at day708072022CommandLine.CommandLineDemo.main(CommandLineDemo.java:6)
    System.out.println(args.length);
    for(String a : args)
    {
    	System.out.println(a);
    }
	
	}

}
