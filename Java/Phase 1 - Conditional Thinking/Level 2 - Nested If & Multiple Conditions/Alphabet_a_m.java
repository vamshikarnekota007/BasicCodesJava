package pratices_java;
import java.util.*;
public class Alphabet_a_m {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Alpabet:");
		char Alphabet =sc.next().charAt(0);
		if(Alphabet>='a' && Alphabet<='m') {
			System.out.println(" First Half");
			}else if(Alphabet>='n' && Alphabet<='z') {
				System.out.println(" Second Half");
			}else {
				System.out.println(" Invalid");
			}
		sc.close();
			}
			
		}
	


