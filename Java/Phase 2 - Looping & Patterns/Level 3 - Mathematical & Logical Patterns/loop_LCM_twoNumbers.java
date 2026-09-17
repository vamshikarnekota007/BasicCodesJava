package pratices_java;
import java.util.*;
public class loop_LCM_twoNumbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        int hcf = 0;

        for (int i = 1; i <= number1 && i <= number2; i++) 
            if (number1 % i == 0 && number2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);

        sc.close();
	}
}
