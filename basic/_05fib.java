package basic;
import java.util.Scanner;
public class _05fib {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		int a=0;
		int b=1;
		
		while(limit>0) {
			System.out.println(a);
			int c=a+b;
			a = b;
			b =c;
			limit = limit-1;
		}
		
		
	}

}
