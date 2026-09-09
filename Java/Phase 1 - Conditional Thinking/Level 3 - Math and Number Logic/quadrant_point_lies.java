package pratices_java;
import java.util.*;
public class quadrant_point_lies {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a  x number:");
	     x=sc.nextInt();
		System.out.print("Enter b  x number:");
		 y=sc.nextInt();
		if(x > 0 && y > 0) {
			System.out.println("Quadrant I");
		}else if(x < 0 && y > 0) {
			System.out.println("Quadrant II");
		}else if(x < 0 && y < 0) {
			System.out.println("Quadrant III");
		}else if(x > 0 && y < 0) {
			System.out.println("Quadrant IV");
		}else {
			System.out.println(" NO Quadrant");
	
		}
		sc.close();
	}

}
