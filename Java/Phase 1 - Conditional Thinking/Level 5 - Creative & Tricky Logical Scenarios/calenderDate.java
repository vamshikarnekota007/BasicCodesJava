package pratices_java;
import java.util.*;
public class calenderDate {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter day: ");
		        int day = sc.nextInt();

		        System.out.print("Enter month: ");
		        int month = sc.nextInt();

		        if (month < 1 || month > 12) {
		            System.out.println("Invalid Date");
		        }
		        else if (month == 2) {
		            if (day >= 1 && day <= 28) {
		                System.out.println("Valid Date");
		            } else {
		                System.out.println("Invalid Date");
		            }
		        }
		        else if (month == 4 || month == 6 || month == 9 || month == 11) {
		            if (day >= 1 && day <= 30) {
		                System.out.println("Valid Date");
		            } else {
		                System.out.println("Invalid Date");
		            }
		        }
		        else {
		            if (day >= 1 && day <= 31) {
		                System.out.println("Valid Date");
		            } else {
		                System.out.println("Invalid Date");
		            }
		        }

		        sc.close();
		    }
		
	}


