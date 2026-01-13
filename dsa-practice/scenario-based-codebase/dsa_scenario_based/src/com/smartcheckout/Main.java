package com.smartcheckout;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inventory setup
        Inventory inventory = new Inventory();

        System.out.print("Enter number of items in inventory: ");
        int itemCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Item name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            inventory.addItem(name, price, stock);
        }

        CheckoutCounter counter = new CheckoutCounter(inventory);

        System.out.print("\nEnter number of customers: ");
        int customerCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < customerCount; i++) {
            System.out.print("\nCustomer name: ");
            String customerName = sc.nextLine();

            Customer customer = new Customer(customerName);

            System.out.print("Number of items to buy: ");
            int buyCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < buyCount; j++) {
                System.out.print("Item name: ");
                String itemName = sc.nextLine();

                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();

                customer.addItem(itemName, qty);
            }

            counter.addCustomer(customer);
        }

        System.out.println("\n--- Processing Queue ---");
        for (int i = 0; i < customerCount; i++) {
            counter.processCustomer();
        }

        sc.close();
    }
}
