package Inter;

public class Main3 {
	public static void main(String[] args){

		   A3 a = new A3(47, 74, 22); //creating object of class A
		   B3 b = new B3(74, 47, 56, 22); //creating object of class B

		   double p1 = a.getPercentage(); //object of class A calling its getPercentage() function 
		   double p2 = b.getPercentage(); //object of class B calling its getPercentage() function

		   System.out.println("Percentage of student A : " + p1);
		   System.out.println("Percentage of student B : " + p2);
		 }
		}


