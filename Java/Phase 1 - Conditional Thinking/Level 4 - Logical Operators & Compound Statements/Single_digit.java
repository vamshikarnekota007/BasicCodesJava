package pratices_java;
import java.util.*;
public class Single_digit {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter number");
		int number =sc.nextInt();
		switch(number) {

	    case 0:
	        System.out.println("Zero");
	        break;

	    case 1:
	        System.out.println("One");
	        break;

	    case 2:
	        System.out.println("Two");
	        break;

	    case 3:
	        System.out.println("Three");
	        break;

	    default:
	        System.out.println("Invalid digit");
	}
	}
}