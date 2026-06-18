package basic;
import java.util.Scanner;

public class _06tarcentre {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			for (int s=0; s<(n-i); s++) {
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++ ) {
				System.out.print("*");
				
			}
			System.out.println();
		}	
	}


}
