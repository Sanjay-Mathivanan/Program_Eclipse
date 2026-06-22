package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
	public static void main(String[] args) {
	
	ArrayList<comparabe3> list = new ArrayList<>();
	
	list.add(new comparabe3("Sanjay","23aib23"))	;
	list.add( new comparabe3("Ragavarshini","23aib12"));
	list.add(new comparabe3("Sindhujashree","23aib33"));
	list.add(new comparabe3("Sivasakthi R","23aib36"));
	
	Collections.sort(list);
	for(comparabe3 obj : list) {
		System.out.println(obj.getname()+ " "+ obj.getrollno());
		
	}
	for(comparabe3 obj : list) {
		System.out.println(obj.getrollno()+ " "+ obj.getname());
		
	}
	
	}
}
