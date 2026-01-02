package com.encapsulation.onlinefooddelivery;

import java.util.List;
import java.util.ArrayList;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Dal Makhni", 250, 2));
        order.add(new NonVegItem("Butter Chicken Naan Combo", 300, 1));

        OrderProcessor.processOrder(order);
    }
}
