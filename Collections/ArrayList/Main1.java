package Collections.ArrayList;
import java.util.*;

public class Main1 {
	
	private static Scanner scan = new Scanner(System.in);
    private static ShoopingCart1 shooping = new ShoopingCart1();
 
    public static void main(String[] args) {
    	
    	boolean exit = false;
    	int userchoice =0;
    	printInstructions();
    	while(!exit) {
    		case 0: 
    			printInstructions();
    			break;
    		case 1:	
    			shooping.printItems();
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
    			break;
    			}
    }
    
    public static void printInstructions() {
	    	System.out.println("press");
	    	System.out.println("0 - to print choices");
	    	System.out.println("1 - to print shooping list");
	    	System.out.println("2 - to add the item");
	    	System.out.println("3 - to modify the item");
	    	System.out.println("4 - to remove the item");
	    	System.out.println("5 - to search the item");
	    	System.out.println("6 - exit");
    }
    
    public static void addItem() {
    		System.out.println("please enter the shooping item");
    		shooping.addItem(scan.nextLine());
    		
    }
    
    public static void modifyItem() {
    		System.out.println("enter a item number");
    		int itemno = scan.nextInt();
    		scan.nextLine();
    		System.out.println("enter a replacement item");
    		String newItem = scan.nextLine();
    		shooping.modifyItem(itemno, newItem);
    		
    }
    public static void removeItem() {
    		System.out.print("insert item to search:");
    		String searchItem = scan.nextLine();
    		
    		
    		
    		
    		
    }
    
    
    
    
    
    
    
}
