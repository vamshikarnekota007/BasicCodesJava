package pratices_java;
import java.util.*;
public class triplet_number {
	public static void main (String[] args) {
		 int a;
		 int b;
		 int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		a=sc.nextInt();
		System.out.print("enter b number:");
		b=sc.nextInt();
		System.out.print("enter c number:");
		c=sc.nextInt();
		if(a*a + b*b ==c*c ) {
			System.out.println("its triplet");
		}else {
			System.out.println("its not triplet");
			
		}
		sc.close();
}
}
