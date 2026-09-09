package pratices_java;
import java.util.*;
public class hours_minitues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a hours");
		int hours = sc.nextInt();
		
		System.out.print("Enter a minutes");
		int minutes = sc.nextInt();
		
		if(hours>=12) {
			System.out.println("pm");
		}else {
			System.out.println("AM");
		}
		sc.close();
	}

}
