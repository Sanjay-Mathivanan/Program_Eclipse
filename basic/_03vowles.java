package basic;

import java.util.Scanner;

public class _03vowles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		char ch = in.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println("The given alphabet is vowel");
			break;
		case 'e':
			System.out.println("The given alphabet is vowel");
			break;
		case 'i':
			System.out.println("The given alphabet is vowel");
			break;
		case 'o':
			System.out.println("The given alphabet is vowel");
			break;
		case 'u':
			System.out.println("The given alphabet is vowel");
			break;
		case 'A':
			System.out.println("The given alphabet is vowel");
			break;
		case 'E':
			System.out.println("The given alphabet is vowel");
			break;
		case 'I':
			System.out.println("The given alphabet is vowel");
			break;
		case 'O':
			System.out.println("The given alphabet is vowel");
			break;
		case 'U':
			System.out.println("The given alphabet is vowel");
			break;
		default:
			System.out.println("The given albhabet is consonant");

		}
	}
}
