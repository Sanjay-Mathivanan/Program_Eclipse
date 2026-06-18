package basic;
import java.util.Scanner;

public class _03vote {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("Voter is elgible");
		}else {
			System.out.println("voter is not elgible");
		}
		
		
	}

}
