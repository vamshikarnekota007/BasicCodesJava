package pratices_java;
import java.util.*;
public class currencyNotes_divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int amount=sc.nextInt();
		if(amount % 200==0 && amount % 500==0 && amount % 100==0) {
			System.out.println("Amount can be evenly divided");
		}else {
			System.out.println("not divided");
			
		}
		sc.close();
	}

}
