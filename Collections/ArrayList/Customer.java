package Collections.ArrayList;
import java.util.*;

public class Customer {
	
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name,double initialamount) {
		this.name = name;
		this.transactions = new ArrayList<>();
		addTransaction(initialamount);
	}
	
	public void addTransaction(double amount) {
		transactions.add(amount);
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Double> getTransactions(){
		return transactions;
	}
	
}
