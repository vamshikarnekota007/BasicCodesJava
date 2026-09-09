package pratices_java;
import java.util.*;
public class TimeOFday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int hour = sc.nextInt();
		if(hour<=11) {
			System.out.println("MORNING");
		}else if(hour<=16) {
			System.out.println("AFTERNOON");
		}else if(hour<=20) {
			System.out.println("EVENING");
		}else
			System.out.println("NIGHT");
			
		}
	}


