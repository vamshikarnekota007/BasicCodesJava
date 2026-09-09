package pratices_java;
import java.util.*;
public class divisibleBY_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = sc.nextInt();
		if(number%5==0 && number %3==0) {
			System.out.println("Divisible");
		}else
			System.out.println("Not Divisible");
		
	}


}


