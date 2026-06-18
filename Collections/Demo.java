package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[]args) {
		List newlist = new ArrayList<>();
		newlist.add(1);
		newlist.add(3);
		newlist.add(2);
		newlist.add(23);
		
		Collections.sort(newlist);
		
		Iterator IT = newlist.listIterator();
		while(IT.hasNext()) {
			System.out.println(" Array List value : " + IT.next());
		}
		
		int search = Collections.binarySearch(newlist,1);
		System.out.println("The searching element is found or not (if found"+ 
				"print that value if not(print the default value of -9):" + search);
		
		Collections.sort(newlist,Collections.reverseOrder());
		
		Iterator IT1 = newlist.listIterator();
		while(IT1.hasNext()) {
			System.out.println("The value of reverse array : "+ IT1.next());
		}
				
		
	}

}
