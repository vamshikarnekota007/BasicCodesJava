package pratices_java;
import java.util.*;
public class loop_sumof_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int sum=0;
		int number=sc.nextInt();
		while(number!=0) {
			 int digit=number%10;
			sum=sum +digit;
			number=number/10;
			
		}
		System.out.println("Sum="+sum);
	}

}
