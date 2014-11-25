import java.util.Scanner;

public class Comparisons {
	
public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter first value");
	String one = scan.nextLine();
	
	System.out.println("Please enter second value");
	String two = scan.nextLine();
	
	System.out.println("Please enter third value");
	String three = scan.nextLine();
	
	
	Object largest = Compare3.largest(new Integer(one),new Integer(two),new Integer(three));
	

	System.out.println(largest);
	
}
	
	
}
