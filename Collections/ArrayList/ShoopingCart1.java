package Collections.ArrayList;

import java.util.ArrayList;

public class ShoopingCart1 {

    private ArrayList<String> list = new ArrayList<>();

    public void addItem(String item) {

        list.add(item);
        System.out.println(item + " added successfully.");
    }

    public void printItems() {
        if (list.isEmpty()) {
            System.out.println("Shopping cart is empty.");
            return;
        }
        System.out.println("\nThere are " + list.size() + " items in your cart:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void modifyItem(int position, String newItem) {
        if (position >= 0 && position < list.size()) {
            list.set(position, newItem);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Invalid Item Number.");
        }
    }

    public void removeItem(int position) {
        if (position >= 0 && position < list.size()) {
            String removedItem = list.remove(position);
            System.out.println(removedItem + " removed successfully.");
        } else {
            System.out.println("Invalid Item Number.");
        }
    }

    public String searchItem(String item) {
        int position = list.indexOf(item);
        if (position >= 0) {
            return list.get(position);
        }

        return null;
    }
}