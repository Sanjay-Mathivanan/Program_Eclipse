package Collections.ArrayList;
import java.util.*;

public class ShoopingCart1 {
	
	private ArrayList<String> list = new ArrayList<>();
	
	private void addItem(String item) {
		list.add(item);
		
	}
	
	private void printItems() {
		System.out.println("There are "+list.size()+"items in your cart");
		for(int i=0;i<list.size();i++) {
			System.out.println("The Items are : " + list.get(i));
		}
	}
	
	private void modifyItem(int position , String newItem) {
		list.set(position, newItem);
		System.out.println("shooping item " + (position+1) +"has been updated");
	}
	
	private void removeItem(int position) {
		String itemName = list.get(position);
		list.remove(itemName);
	}
	
	private String searchItem(int searchitem) {
		int position = list.indexOf(searchitem);
		if(position >=0) {
			return list.get(position);
		}else {
			return null;
		}
		
	}


	

}
