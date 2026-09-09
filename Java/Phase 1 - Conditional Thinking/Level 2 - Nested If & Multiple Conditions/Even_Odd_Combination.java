package pratices_java;
import java.util.*;

public class Even_Odd_Combination {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a= sc.nextInt();
        System.out.println("Enter Second number");
        b= sc.nextInt();
        if( a % 2==0 && b % 2 ==0) {
        	System.out.println("Even");
        }else if( a % 2 == 1 && b % 2 ==1) {
        	System.out.println("Odd");
        }else {
        	System.out.println("one even and one odd");
        }
        sc.close();
    }
}
