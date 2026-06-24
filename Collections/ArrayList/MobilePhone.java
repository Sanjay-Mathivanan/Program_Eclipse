package Collections.ArrayList;
import java.util.*;

public class MobilePhone {
	
	ArrayList<String> list = new ArrayList<>();
	
	public void addName(String contact) {
		list.add(contact);
		System.out.println(contact + "added succesfully");
	}
	public void printName() {
		if(list.isEmpty()) {
			System.out.println("No contact name is availble");
			return;
		}else {
			for(int i=0;i<list.size();i++) {
				System.out.println((i+1) + ". " + list.get(i));
			}
		}
	}
	
	public void ModifyItem(int position, String newConName) {
		if(position >=0 && position<list.size()) {
			list.set(position, newConName);
			System.out.println("new Contact name updated successfully");
		}else {
			System.out.println("Invaild Item Number");
		}
	}
	
	public void removeItem(int position) {
		if(position >=0 && position < list.size()) {
			String removeditem = list.remove(position);
			System.out.println(removeditem + " removed sucessfully");
		}else {
			System.out.println("Invalid Item number");
		}
	}
	
	public String searchItem(String item) {
		int position = list.indexOf(item);
		if(position >=0) {
			return list.get(position);
		}
		return null;
	}
	
	

}
