package pratices_java;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Alaphbent:");
		char ch = sc.next().charAt(0);
		 if(ch=='v'|| ch=='o'||ch=='w'||ch=='e'||ch=='l'||ch=='s') {
			 System.out.println("vowels");
		 }
		 else
			 System.out.print("Consonant");
			 
		 }
		
	}


