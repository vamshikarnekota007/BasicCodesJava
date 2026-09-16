package pratices_java;

import java.util.*;

public class loop_armstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (originalNumber == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}