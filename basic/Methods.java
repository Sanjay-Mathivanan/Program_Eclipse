package basic;
import java.util.Scanner;
public class Methods {
	String name = "";
	int age = 0;
	
	public static void main(String[]args) {
		Methods det = new Methods();
		
		/*
		 * det.name="sanjay"; det.age = 19; System.out.println(det.name);
		 * System.out.println(det.age);
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name: ");
		det.name = scan.nextLine();
		System.out.print("Enter a age: ");
		det.age = scan.nextInt();
		
		 System.out.println(det.name);
		 System.out.println(det.age);
		
	}
}
