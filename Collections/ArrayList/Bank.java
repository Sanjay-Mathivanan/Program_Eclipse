package Collections.ArrayList;
import java.util.*;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {

        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {

        if(findBranch(branchName) == null) {

            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName,String customer,double amount) {

        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.newCustomer(customer, amount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customer,double amount) {

        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.addCustomerTransaction(customer, amount);
        }

        return false;
    }

    public void listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);

        if(branch == null) {
            System.out.println("Branch not found");
            return;
        }

        System.out.println("Customers of " + branchName);

        for(Customer customer : branch.getCustomers()) {

            System.out.println(customer.getName());

            if(showTransactions) {

                System.out.println("Transactions:");

                for(Double amount : customer.getTransactions()) {
                    System.out.println(amount);
                }
            }
        }
    }

    private Branch findBranch(String branchName) {

        for(Branch branch : branches) {

            if(branch.getBranchName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }

        return null;
    }
}
