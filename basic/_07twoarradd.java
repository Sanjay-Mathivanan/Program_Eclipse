package basic;
import java.util.Scanner;
public class _07twoarradd {
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("enter a row limit:");
		int r = scan.nextInt();
		System.out.print("enter a column limit:");
		int c = scan.nextInt();
		
		int [][]a = new int[r][c];
		int [][]b = new int[r][c];
		int [][]sum = new int[r][c];
		
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print("enter a arr1 values: ");
				a[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print("enter a arr2 values: ");
				b[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {                                                        
				sum[i][j]=a[i][j] + b[i][j];
				}
		}
		
		for(int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
