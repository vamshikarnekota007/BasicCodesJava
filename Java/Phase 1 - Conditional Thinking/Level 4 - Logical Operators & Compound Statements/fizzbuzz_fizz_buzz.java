package pratices_java;
import java.util.*;
public class fizzbuzz_fizz_buzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enetr number");
		int number = sc.nextInt();
		
		if(number % 3==0 && number % 5==0) {
			System.out.println("fizzbuzz");
		}else if(number % 3==0) {
			System.out.println("fizz");
		}else if(number % 5==0) {
			System.out.println("buzz");
		}else {
			System.out.println("noithing");
		}
		sc.close();

	}

}
