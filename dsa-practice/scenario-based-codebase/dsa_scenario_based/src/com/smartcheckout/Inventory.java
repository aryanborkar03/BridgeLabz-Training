package com.smartcheckout;
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> items = new HashMap<>();

    public void addItem(String name, double price, int stock) {
        items.put(name, new Item(name, price, stock));
    }

    public Item getItem(String name) {
        return items.get(name);
    }
}
