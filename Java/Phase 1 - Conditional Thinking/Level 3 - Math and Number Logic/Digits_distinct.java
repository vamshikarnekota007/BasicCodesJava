package pratices_java;
import java.util.*;
public class Digits_distinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number");
		int number=sc.nextInt();
		int first = number / 100;
		int middle = (number / 10) % 10;
		int last = number % 10;
		if( first!= middle && first!= last && middle!=last) {
			System.out.println("digints");
		}else {
			System.out.println(" not digints");
			
		}
		
		
		
		
	}

}
