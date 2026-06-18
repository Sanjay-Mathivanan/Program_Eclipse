package basic;
import java.util.Scanner;
public class _04armstrong {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		int sum =0;
		int temp =n;
		
		while(n>0) {
			
			int rem=n%10;
			int m = rem*rem*rem;
			sum = sum+m;
			n = n/10;
		}
		if(temp == sum) {
			System.out.println("It is a Armstrong ");
		}else {
			System.out.println("It is a not Armstrong ");
		}
	}

}
