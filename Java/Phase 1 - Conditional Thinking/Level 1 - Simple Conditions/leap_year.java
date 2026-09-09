package pratices_java;
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year:");
		int number= sc.nextInt();
		if(number%4==0) {
			System.out.println("leap year");
		}else if (number%100==0) {
			System.out.println("not leap");
			
		}else if(number%400==0)
			System.out.println(" leap year");
		}else {
		System.out.println("not a leap year:");
		}
		sc.close();
			
		
		
	}
}


