package pratices_java;
import java.util.*;
public class loop_A_and_b_Divisible7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a: ");
	        int a = sc.nextInt();

	        System.out.print("Enter b: ");
	        int b = sc.nextInt();

	        for (int i = a; i <= b; i++) {

	            if (i % 7 == 0) {
	                System.out.println(i);
	            }
	        }

	        sc.close();
	    }
	}


