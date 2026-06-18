package basic;
import java.util.Scanner;
public class _03threelar {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a three Numbers: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		if(number1>number2 && number1>number3) {
			System.out.println("Number1 is largest");
		}else if (number2>number1 && number2>number3) {
			System.out.println("Number2 is largest");
		}else {
			System.out.println("Number3 is largest");
		}
		}

}
