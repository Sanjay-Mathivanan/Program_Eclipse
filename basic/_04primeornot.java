package basic; 

import java.util.Scanner; 

public class _04primeornot { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        
        while (true) { 
            System.out.print("Enter a number: ");
            int num = scan.nextInt(); 
            
            // Fix 1: Add 'continue' to skip processing invalid inputs
            if (num <= 1) { 
                System.out.println("It is not prime number"); 
                continue; 
            } 
            
            boolean isprime = true; 
            
            // Fix 2 & 3: Change loop condition to '<' and use variable 'i'
            for (int i = 2; i < num; i++) { 
                if (num % i == 0) { 
                    isprime = false; 
                    break; // Optimization: Stop checking once a factor is found
                } 
            } 
            
            if (isprime) { 
                System.out.println("Number is a prime number"); 
            } else { 
                System.out.println("Number is not a prime number"); 
            } 
        } 
    } 
}
