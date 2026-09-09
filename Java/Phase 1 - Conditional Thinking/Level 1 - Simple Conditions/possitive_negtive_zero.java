package pratices_java;
import java.util.*;
public class possitive_negtive_zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number =sc.nextInt();
		if(number>0) {
			System.out.println("possitive");
		}else if(number<0) {
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
			
		}
		sc.close();
				
	}

}
