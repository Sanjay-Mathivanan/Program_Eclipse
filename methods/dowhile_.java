package methods;
import java.util.Scanner;
public class dowhile_ {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int rem;
		int sum=0;
		
		do {
			rem=n%10;
			sum += rem;
			n =n/10;
		}while(n!=0);
		System.out.println(sum);
	}

}
