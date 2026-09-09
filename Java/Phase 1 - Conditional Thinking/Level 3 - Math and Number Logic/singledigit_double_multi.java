package pratices_java;
import java.util.*;
public class singledigit_double_multi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit:");
		int number=sc.nextInt();
		if(number>=1 && number<=9) {
			System.out.print("single Digit");
		}else if(number>=10 && number<=99) {
			System.out.println("Double digit");
			}else {
				System.out.println("multi digit");
			}
		sc.close();
				
			}
	}
		


