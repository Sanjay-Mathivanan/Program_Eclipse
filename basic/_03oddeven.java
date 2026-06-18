package basic;
import java.util.Scanner;

public class _03oddeven {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number%2 == 0 ) {
			System.out.println("Number is even ");
		}else {
			System.out.println("number is odd ");
		}
		
	}

}
