package Collections.ArrayList;

import java.util.ArrayList;

public class Main4 {
	
	public static void main(String[] args) {
		Customer cus = new Customer("sanjay",1000.75);
		String name = cus.getName();
		System.out.println(name);
		
		cus.addTransaction(200);
		ArrayList<Double> new1 = cus.getTransactions();
		System.out.println(new1);
		
	}

}
