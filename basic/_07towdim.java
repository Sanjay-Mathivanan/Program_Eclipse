package basic;
import java.util.Scanner;
public class _07towdim {
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("enter a row limit:");
		int r = scan.nextInt();
		System.out.print("enter a column limit:");
		int c = scan.nextInt();
		
		int [][]arr = new int[r][c];
		
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print("enter a arr values: ");
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
	}

}
