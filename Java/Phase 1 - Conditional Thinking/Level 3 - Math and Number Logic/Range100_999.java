package pratices_java;
import java.util.*;
public class Range100_999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int number =sc.nextInt();
		if(number>=100 && number<=999) {
			System.out.println("in range");
		}else {
			System.out.println("not in range");
		}
		sc.close();
		
	}

}
