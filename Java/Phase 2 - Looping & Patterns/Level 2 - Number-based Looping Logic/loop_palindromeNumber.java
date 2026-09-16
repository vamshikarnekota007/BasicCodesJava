package pratices_java;
import java.util.*;
public class loop_palindromeNumber {

	public static void main(String[] args) {
		int number=1221;
		int original =number;
		int reverse=0;
		while(number!=0) {
			int digit=number % 10;
			reverse=reverse *10+digit;
			number=number/10;
		}
		if(original==reverse) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("Not palindrome");
			
		}
		
		
	}

}
