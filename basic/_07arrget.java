package basic;
import java.util.Scanner;
public class _07arrget {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr2 = new int[size];
		for(int i=0; i<size; i++) {
			arr2[i]=scan.nextInt();

		}
		System.out.println(arr2);
	}
	
	
}
