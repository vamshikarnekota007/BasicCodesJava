package pratices_java;
import java.util.*;
public class bill_units {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter units:");
		int units=sc.nextInt();
		int bill=sc.nextInt();
		if (units <= 100) {
		    bill = units * 2;
		}
		else if (units <= 200) {
		    bill = units * 3;
		}
		else {
		    bill = units * 5;
		}
		}

	}


