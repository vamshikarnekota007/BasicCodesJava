package pratices_java;
import java.util.*;
public class loop_ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number =sc.nextInt();
		
		int reverse=0;
		int lastDigit;
		while(number!=0) {
			lastDigit=number%10;
			number=number/10;
			reverse=reverse*10+lastDigit;
			
		}
		System.out.println("Revese="+reverse);
		
		
	}

}

