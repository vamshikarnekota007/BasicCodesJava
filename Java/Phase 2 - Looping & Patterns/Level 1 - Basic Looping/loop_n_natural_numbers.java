package pratices_java;
import java.util.*;
public class loop_n_natural_numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
			System.out.println("Sum="+sum);
		}
	}



