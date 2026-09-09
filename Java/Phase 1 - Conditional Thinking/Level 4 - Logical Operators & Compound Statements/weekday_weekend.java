package pratices_java;
import java.util.*;
public class weekday_weekend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number");
		int number =sc.nextInt();
		if(number>1 && number<5) {
			System.out.println("weekday");
		}else {
			System.out.println("weekend");
		}
	}

}
