package basic;
import java.util.Scanner;

public class _03posorneg {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
		int number = scan.nextInt();
		
		if(number > 0) {
			System.out.println("number is postive");
		}else {
			System.out.println("number is negative ");
		}
		
		
		
	}

}
