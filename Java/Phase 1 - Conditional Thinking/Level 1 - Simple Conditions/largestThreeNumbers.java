package pratices_java;
import java.util.*;
public class largestThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int a = sc.nextInt();

        System.out.print("Enter a second number: ");
        int b = sc.nextInt();

        System.out.print("Enter a third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        sc.close();
    }
}


    
