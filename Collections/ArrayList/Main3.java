package Collections.ArrayList;
import java.util.*;

public class Main3 {
	private static Scanner scan = new Scanner(System.in);
	private static MobilePhone mobile = new MobilePhone();
	
	public static void main(String[] args) {
		boolean index = false;

		while(!index) {
			System.out.print("Please enter a number 0 for the menu:");
			int choice = scan.nextInt();
			switch(choice) {
			case 0:
				indexmenu();
				break;
			case 1:
				mobile.printName();
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
				index = true;
				System.out.println("exiting with mobilecontact");
				break;
			
			default:
				System.out.println("Invalid choice");					
			}
		}	
		
	}
	
	public static void indexmenu(){
	      System.out.println("\n===== MENU =====");
	        System.out.println("0 - Print Instructions");
	        System.out.println("1 - Print Contact Name List");
	        System.out.println("2 - Add Name");
	        System.out.println("3 - Modify Name");
	        System.out.println("4 - Remove Name");
	        System.out.println("5 - Search Name");
	        System.out.println("6 - Exit");
	}
	
	public static void addItem() {
	    scan.nextLine();

		System.out.print("Enter Contact Name");
		mobile.addName(scan.nextLine());
	}
	
	public static void modifyItem() {
		System.out.print("Enter a ContactName Number :");
		int ContactNo =scan.nextInt();
		scan.nextLine();
		System.out.print("Enter new contactName name:");
		String newContactName = scan.nextLine();
		mobile.ModifyItem(ContactNo -1, newContactName);
	}
	
	public static void removeItem() {
		System.out.print("enter a contactname number to remove: ");
		int removeContnum = scan.nextInt();
		scan.nextLine();
		mobile.removeItem(removeContnum -1);
	}
	
	public static void searchItem() {
		System.out.print("Enter Contact name to search:");
		String item = scan.nextLine();
		String result = mobile.searchItem(item);
		if(result != null) {
			System.out.println(result + " found in cart");
		}else {
			System.out.println("item not found");
		}
	}

}
