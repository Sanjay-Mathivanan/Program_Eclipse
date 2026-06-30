package Collections.ArrayList;
import java.util.*;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean newCustomer(String name, double amount) {

        if(findCustomer(name) == null) {
            customers.add(new Customer(name, amount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double amount) {

        Customer customer = findCustomer(name);

        if(customer != null) {
            customer.addTransaction(amount);
            return true;
        }

        return false;
    }

    public Customer findCustomer(String name) {

        for(Customer customer : customers) {

            if(customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }

        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
