package pratices_java;
import java.util.*;
public class Grade_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		if(number>=90) {
			System.out.println(" GRADE A");
		}else if(number>=80) {
			System.out.println(" GRADE B");
		}else if(number>70) {
			System.out.println(" GRADE c");
		}else if(number>60) {
			System.out.println(" GRADE D");
		}else
			System.out.println("FAIL");
		
		}
}
	//sc.close();
		









