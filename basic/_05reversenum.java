package basic;
import java.util.Scanner;
public class _05reversenum {
	public static void main(String[] args) {
		int num ,rev, rem ;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		rev = 0;
		while(num>0) {
			
			rem = num%10;
			rev = rev*10+rem;
			num =num/10;
			}
		System.out.println(rev);
		}
	
	}


