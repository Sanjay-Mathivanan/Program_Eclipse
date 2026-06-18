package basic;
import java.util.Scanner;
public class _03leafornot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		int year = scan.nextInt();
		
		if((year% 400 == 0 ) || (year %4 ==0 && year %100 !=0)) {
			System.out.println("given year is leaf year");
		}
		else {
			System.out.println("Given year is not leaf year");
		}
		}
	}

}
