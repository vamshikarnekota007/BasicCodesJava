package pratices_java;
import java.util.*;
public class eligibleORnot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr a Number:");
		int number = sc.nextInt();
		if(number>18) {
			System.out.println("Eligible");
		}
		else if(number<18) {
			System.out.println("not Eligible");
			
			
		}
		sc.close();
	}

}
