package pratices_java;
import java.util.*;
public class sum_LESSTHEN_100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number");
		int a=sc.nextInt();
		
		System.out.print("enter b number");
		int b=sc.nextInt();
		
		if(a>0 && b>0 && a+b<100) {
			System.out.println("lessthan 100");
		}else {
			System.out.println("morethan 100");
		}
		sc.close();
	}

}
