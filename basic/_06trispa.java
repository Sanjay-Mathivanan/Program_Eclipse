package basic;

import java.util.Scanner;

public class _06trispa {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int n =scan.nextInt();
		for(int i=1;i<=n; i++) {
		   for(int s=0; s<(n-i); s++) {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
			   System.out.print("*");
		   }
		   System.out.println();
		}
	}

}
