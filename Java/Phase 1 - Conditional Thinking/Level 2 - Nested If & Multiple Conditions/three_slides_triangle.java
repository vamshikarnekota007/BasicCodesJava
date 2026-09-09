package pratices_java;
import java.util.*;
public class three_slides_triangle {

	public static void main(String[] args) {
		int a ;
		int b ;
		int c ;		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter value a");
		 a = sc.nextInt();
		System.out.println("enter value b");
		 b = sc.nextInt();
		System.out.println("enter value c");
		 c = sc.nextInt();
		if(a+b>c && b+c>a && a+c>b) {
			System.out.println("valid triangle");
		}else
				System.out.println("invalid");
		}	
	}

