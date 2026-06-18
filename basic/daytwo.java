package basic;
import java.util.Scanner;

public class daytwo {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
//		int val =(int)ch;
//*		if (val==122) {
//			System.out.println("a");
//		}
//		else{
//				System.out.println((char)(val+1));
//			}

/*		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println((char)(ch-32));
		}
		else if (ch >= 'A' && ch <='Z') {
			System.out.println((char)(ch+32));	
		}
		else {
			System.out.println("not a alp");
		}
		
		}
 */
	
		
		if (ch >= 'a' && ch <= 'z') {
			char upper =((char)(ch-32));
			
			if(upper == 'Z') {
				System.out.println('A');
			}
			else {
				System.out.println((char)(upper+1));
			}
			     
			
		}
		else if (ch >= 'A' && ch <='Z') {
            char lower = (char)(ch + 32);  
            
            if (lower == 'z') {
                System.out.println('a');  
            } else {
                System.out.println((char)(lower + 1));
            }
		}

		else {
			System.out.println("not a alp");
		}
		
	}
}
	
	


