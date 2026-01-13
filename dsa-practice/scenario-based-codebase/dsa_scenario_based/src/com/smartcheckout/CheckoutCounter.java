package com.smartcheckout;
import java.util.LinkedList;
import java.util.Queue;

public class CheckoutCounter {
    private Queue<Customer> queue = new LinkedList<>();
    private Inventory inventory;

    public CheckoutCounter(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.getName() + " joined the queue");
    }

    public void processCustomer() {
        Customer customer = queue.poll();

        if (customer == null) {
            System.out.println("No customers in queue");
            return;
        }

        double total = 0;

        for (String itemName : customer.getCart().keySet()) {
            int qty = customer.getCart().get(itemName);
            Item item = inventory.getItem(itemName);

            if (item != null && item.getStock() >= qty) {
                total += item.getPrice() * qty;
                item.reduceStock(qty);
            }
        }

        System.out.println(customer.getName() + " bill = ₹" + total);
    }
}
