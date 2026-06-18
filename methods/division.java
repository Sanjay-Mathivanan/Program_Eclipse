package methods;
import java.util.Scanner;
public class division {
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			String student_name=scan.nextLine();
			int student_score =scan.nextInt();
			char student_division=divisionrank(student_score);
			System.out.println(student_division);
			
			
		}
		public static char divisionrank(int student_score) {
			char div;
			if(student_score>=80) {
				div = 'a';
			}else if(student_score>=60 && student_score<80) {
				div='b';
			}else {
				div='c';
			}
			return div;
			
		}

}
