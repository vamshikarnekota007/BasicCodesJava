package pratices_java;
import java.util.*;
public class loop_sum_even_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int number=sc.nextInt();
		int sum =0;
		for(int i=1;i<=number;i++) {
			if(i %2==0) {
			sum=sum+i;
			System.out.println("hello");
		}
		}
			System.out.println(sum);
	}
	}



