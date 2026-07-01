package Collections;
import java.util.*;

public class Auto_Un_boxing {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(list.get(i));
		}
	}

}
