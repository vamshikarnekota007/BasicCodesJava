package pratices_java;
import java.util.*;
public class three_digit_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int number =sc.nextInt();
		if(number>=100 && number<=999 && number % 2==0) {
			System.out.println("even number");
		}else {
			System.out.println("no even number");
		}
		sc.close();
	}

}
