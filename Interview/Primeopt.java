package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Primeopt {
	public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in);
    System.out.print("enter a upper limit:");
	int n = scan.nextInt();
	boolean[] isprime = new boolean[n+1];
	
	Arrays.fill(isprime, true);
	
	if(n >=0) isprime[0]=false;
	if(n>=1) isprime[1]=false;
	
	for(int i=2;i*i<=n;i++) {
		if(isprime[i]) {
			for(int j=i*i;j<=n;j +=i) {
				isprime[j]=false;
			}
		}
	}
	
	System.out.print("Enter starting range (lower limit): ");
    int start = scan.nextInt();

    System.out.println("Prime numbers between " + start + " and " + n + " are:");
    for (int i = Math.max(2, start); i <= n; i++) {
        if (isprime[i]) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
	}

}


/**
 * ==========================================
 *        SIEVE OF ERATOSTHENES DEFINITION
 * ==========================================
 * 
 * WHAT IS IT?
 * The Sieve of Eratosthenes is an ancient, highly efficient 
 * algorithm used to find all prime numbers up to a given limit (N).
 * 
 * CORE PRINCIPLE:
 * Instead of checking each number individually to see if it is prime, 
 * the algorithm works backward by systematically eliminating composites.
 * 
 * HOW IT WORKS (STEP-BY-STEP):
 * 1. Create a grid/list of numbers from 2 up to N.
 * 2. Start at the first un-crossed number (2) and mark it as prime.
 * 3. Cross out all of its multiples (4, 6, 8, 10...) as composite.
 * 4. Move to the next un-crossed number (3) and mark it as prime.
 * 5. Cross out all of its remaining multiples (9, 15, 21...).
 * 6. Repeat this process up to the square root of N (√N).
 * 
 * THE SURVIVORS:
 * Once the loop terminates, any number left un-crossed in the list 
 * is guaranteed to be a prime number.
 * 
 * TIME COMPLEXITY:
 * O(N log log N) - This is nearly linear, making it exponentially 
 * faster than traditional trial division for generating prime lists.
 */

