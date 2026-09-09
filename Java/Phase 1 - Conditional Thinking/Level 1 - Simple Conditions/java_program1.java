package pratices_java;
import java.util.*;
public class java_program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int Number=sc.nextInt();
		if(Number>0) {
		System.out.println("Positive");
		}
		else if(Number<0){
		System.out.println("Negative");
		}
		else {
		System.out.println("Zero");
	}
		sc.close(); 

}
}
