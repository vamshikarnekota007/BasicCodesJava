package pratices_java;
import java. util.*;
public class hot_warm_hot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Temperature:");
		int temperature  = sc.nextInt();
		if(temperature<20) {
			System.out.println("COLD");
		}else if (temperature<30) {
			System.out.println("WARM");
		}else
			System.out.println("hot");
		
			
			
		}
	}


