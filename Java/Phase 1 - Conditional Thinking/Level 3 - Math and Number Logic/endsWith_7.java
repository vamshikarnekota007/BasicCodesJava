package pratices_java;
import java.util.*;
public class endsWith_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int number=sc.nextInt();
		if(number %7==0 || number%10==7) {
			System.out.println("multiple of 7 OR ends with 7");
		}else {
			System.out.println("invalid");
			
		}
		sc.close();
	}

}
