package basic;
import java.util.Scanner;
public class _05palindrome {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int temp = num;
		int sum=0;
		
		while(num>0) {
			
			int remainder=num%10;
			sum =sum*10+remainder;
			num = num/10;
			
		}
		
		if(temp == sum) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}

}
