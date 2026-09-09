package pratices_java;
import java.util.*;
public class INCOME_age {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Eneter AGE:");
		int age =sc.nextInt();
		
		System.out.print("Eneter INCOME:");
		int income =sc.nextInt();
		
		if(age>18 && income >500000) {
			System.out.println("eligible");
		}else {
			System.out.println("not eligible");
			
		}
		sc.close();
	}

}
