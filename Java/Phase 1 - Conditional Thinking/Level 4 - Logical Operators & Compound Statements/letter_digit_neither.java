package pratices_java;
import java.util.*;
public class letter_digit_neither {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a something:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Alaphates");
		}else if(ch>='0' && ch<='9'){
				System.out.println("digits");
	}else {
		System.out.println("neither");
				
	}
		sc.close();

}
}

