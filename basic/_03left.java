package basic;
import java.util.Scanner;

public class _03left {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int left= number << 1;
		System.out.println("left shift" + " " + left);
		
	}

}
