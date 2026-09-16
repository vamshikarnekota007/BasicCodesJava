package pratices_java;
import java.util.*;
public class _loop_prime_are_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i = 2;
        boolean isprime=true;
        
        while(i<number) {
        	if(number % i==0) {
        		isprime=false;
        	}
        	i++;
        }
        	if(isprime) {
        		System.out.println("prime Number");
        	}else {
        		System.out.println("not prime");
        	}
        
        }
    }



