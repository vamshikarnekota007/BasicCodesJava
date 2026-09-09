package pratices_java;
import java.util.*;
public class equilateral_triangle {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter b value");
		b= sc.nextInt();
		System.out.println("Enter c value");
		c= sc.nextInt();
		if (a == b && b == c) {
		    System.out.println("Equilateral");
		}
		else if (a == b || a == c || b == c) {
		    System.out.println("Isosceles");
		}
		else {
		    System.out.println("Scalene");
		}
		sc.close();
			
		}
				
	}

