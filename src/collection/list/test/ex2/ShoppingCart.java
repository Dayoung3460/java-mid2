package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> itemArr = new ArrayList<>();

    public void add(Item item) {
        itemArr.add(item);
    }

    public void displayItem() {
        System.out.println("shopping cart");
        int totalPrice = 0;
        for (Item item : itemArr) {
            System.out.println("Item name: " + item.getName() + ", total: " + item.getTotalPrice());
            totalPrice += item.getTotalPrice();
        }

        System.out.println("total price: " + totalPrice);
    }
}
