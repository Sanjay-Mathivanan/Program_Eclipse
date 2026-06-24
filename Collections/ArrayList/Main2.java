package Collections.ArrayList;
import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		ArrayList<DataSort> a = new ArrayList<>();
		a.add(new DataSort("01-01-2026"));
		a.add(new DataSort("10-01-2025"));
		a.add(new DataSort("25-05-2006"));
		a.add(new DataSort("09-05-2026"));
		a.add(new DataSort("13-06-2010"));
  
		Collections.sort(a, new sortItems());

		System.out.println("Sorted in ascending order: ");
		for(DataSort d : a) {
			System.out.println(d.date);
		}
	}
	

}

class DataSort {
	String date;
	DataSort(String date) {
		this.date = date;
	}
	
}

class sortItems implements Comparator<DataSort>{
	
	public int compare(DataSort a , DataSort b) {
		return a.date.compareTo(b.date);
	}
	
}


