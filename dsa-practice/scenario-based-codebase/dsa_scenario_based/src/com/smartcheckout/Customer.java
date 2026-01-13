package com.smartcheckout;
import java.util.HashMap;

public class Customer {
    private String name;
    private HashMap<String, Integer> cart = new HashMap<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addItem(String itemName, int qty) {
        cart.put(itemName, qty);
    }

    public HashMap<String, Integer> getCart() {
        return cart;
    }

    public String getName() {
        return name;
    }
}
