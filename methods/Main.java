package methods;
import java.util.*;

public class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number for sumof last-first and odd numbers:");
		int number = scan.nextInt();
		
		int result = sumFirstAndLastDigit(number);
		System.out.println("sum of first and last digit number :" + result);
		
		int odd_result= oddsum(number);
		System.out.println("add of odd numbers: " + odd_result);
		System.out.println("");
		
		
		System.out.print("Enter a 2 digit num1 :");
		int n1 = scan.nextInt();
		System.out.print("Enter a 2 digit num2 : ");
		int n2 = scan.nextInt();
		
		boolean res = shareddigit(n1,n2);
		System.out.println("shared digit result :" + res);
		System.out.println("");
		
		System.out.print("Enter a number>10 :");
		int n3 = scan.nextInt();
		System.out.print("Enter a number?10 : ");
		int n4 = scan.nextInt();
		int re=getGreatestCommonDivisor(n3,n4);
		System.out.println(re);
		
	}
	
	
	public static int sumFirstAndLastDigit(int number) {
		if(number<0) {
			return -1;
			
		}
		int first =0;
		int last = number%10;
		int num =number/10;
		
		while(num!=0) {
			if(num/10==0) {
				first = num%10;
				
			}
			num =num/10;
		}
		return first +last;
	}
	
	public static int oddsum(int number) {
		if(number <0) {
			return -1;
		}
		
		int sum =0;
		while(number!=0) {
			int last = number%10;
			if(last%2 !=0) {
				sum=sum+last;
				
			}
			number = number/10;
		}
		return sum;
		
	}
	
	public static boolean shareddigit(int n1, int n2) {
		boolean ans =false;
		int leftn1=n1/10;
		int rightn1=n1%10;
		int leftn2=n2/10;
		int rightn2=n2%10;
		
		if(leftn1 == rightn2 ||leftn1==leftn2 || rightn1==leftn2||rightn1==rightn2 ) {
			ans = true;
		}
		return ans;
	}
	
    public static int getGreatestCommonDivisor (int n3, int n4) {
        int greatest = 0;

        if(n3 > 10 && n4 > 10){

            for(int i = 1; ((i <= n3) && (i <=n4)); i++ ){
                if((n3 % i == 0) && (n4 % i == 0)){
                    greatest = i;
                }
            }
            return greatest;
        } 
        else
            return -1;
    }

}
