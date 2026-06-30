package Collections.ArrayList;

import java.util.ArrayList;

public class Main4 {

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");

        bank.addBranch("Coimbatore");
        bank.addBranch("Chennai");

        bank.addCustomer("Coimbatore", "Sanjay", 1000);
        bank.addCustomer("Coimbatore", "Arun", 2000);

        bank.addCustomerTransaction("Coimbatore", "Sanjay", 500);
        bank.addCustomerTransaction("Coimbatore", "Sanjay", 700);

        bank.addCustomerTransaction("Coimbatore", "Arun", 1000);

        bank.listCustomers("Coimbatore", true);
    }
}