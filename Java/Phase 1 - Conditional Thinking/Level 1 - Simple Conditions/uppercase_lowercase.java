package pratices_java;
import java.util.*;
public class uppercase_lowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		//String input=sc.next();
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("Uppercase");
			
		}else if(ch>='a'&& ch<='z') {
			System.out.println("lowecase");
			
		}else if(ch>='0'&& ch<='9') {
			System.out.println("Digits");
			
		}else
			System.out.println("Special character");
		
	
		}
    }
