package basic;
import java.util.Scanner;

public class _03highernum {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		if(number1>number2) {
			System.out.println("number1 is greater then number2");
		}else {
			System.out.println("number2 is greater then number1");
		}
		
	}
	
	
	

}
