
package methods;
import java.util.Scanner;


public class marks {
	
	public static void main(String[]args) {
		String name = "sanjay";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a mark: ");
		int mark =scan.nextInt();
		//int mark = 96;
		grade(mark);
		char rank = grade(mark);
		System.out.println("rank :");
		System.out.println(rank);
		
		
	}
	
	public static char grade(int mark) {
		char g; // grade
		if(mark>=90 && mark<=100) {
			g = 'o';
		}else if(mark>80 && mark<=89){
			g='a';
		}else {
			g='b';
		}
		return g;
		
	}
	

}
