package pratices_java;

import java.util.Scanner;

public class loop_PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number=sc.nextInt();
		int sum =0;
		int i=1;
		while(i<number) {
			if(number % i ==0) {
			sum=sum+i;
		}
			i++;
	}

			if (sum == number) {
			    System.out.println("Perfect number");
			} else {
			    System.out.println("Not perfect number");
			}
	}
}
