package Collections.ArrayList;

import java.util.Scanner;

public class Main1 {

    private static Scanner scan = new Scanner(System.in);
    private static ShoopingCart1 shopping = new ShoopingCart1();

    public static void main(String[] args) {
        boolean exit = false;
        printInstructions();
        
        while (!exit) {
            System.out.print("\nEnter your choice: ");
            int userChoice = scan.nextInt();
            scan.nextLine();

            switch (userChoice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shopping.printItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Shopping Cart...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }

 
    }

    public static void printInstructions() {

        System.out.println("\n===== SHOPPING CART MENU =====");
        System.out.println("0 - Print Instructions");
        System.out.println("1 - Print Shopping List");
        System.out.println("2 - Add Item");
        System.out.println("3 - Modify Item");
        System.out.println("4 - Remove Item");
        System.out.println("5 - Search Item");
        System.out.println("6 - Exit");
    }

    public static void addItem() {
        System.out.print("Enter Item Name: ");
        shopping.addItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter Item Number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter New Item Name: ");
        String newItem = scan.nextLine();
        shopping.modifyItem(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter Item Number to Remove: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        shopping.removeItem(itemNo - 1);
    }

    public static void searchItem() {
        System.out.print("Enter Item Name to Search: ");
        String item = scan.nextLine();
        String result = shopping.searchItem(item);
        if (result != null) {
            System.out.println(result + " found in cart.");
        } else {
            System.out.println("Item not found.");
        }
    }
}