package Collections;
import java.util.*;


public class Main1 {
    public static void main(String[] args) {

        ArrayList<comparable> list = new ArrayList<>();

        list.add(new comparable(80));
        list.add(new comparable(60));
        list.add(new comparable(90));

        Collections.sort(list);

        System.out.println(list);
    }
}